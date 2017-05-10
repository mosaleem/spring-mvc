package com.sam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sam.pojo.User;


@Service("UserDao")
@Transactional
public class UserDao {
	private SimpleJdbcTemplate simpleJdbcTemplate;

	private SimpleJdbcInsert addusers;
	private SimpleJdbcInsert addhobbies;
	@Resource(name = "dataSource")
	public void setDataSource(DataSource dataSource) {
		this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
		this.addusers = new SimpleJdbcInsert(dataSource).withTableName(
				"users").usingGeneratedKeyColumns("id");
		this.addhobbies = new SimpleJdbcInsert(dataSource).withTableName(
				"hobbies").usingGeneratedKeyColumns("id");

	}
	
	public Integer loginCheck(String email, String password) {
		try {
			
			String sql = "select id from users where email ='" + email
					+ "' and password='" + password + "' ";
			Integer result = simpleJdbcTemplate.queryForObject(sql,
					Integer.class);
			return result;

		} catch (Exception e) {
			return 0;

		}
	}
	
	
	public User findById(Integer id) {
		try {
			
			
			String sql = "SELECT * FROM users JOIN hobbies ON users.id=hobbies.user_id WHERE users.id=" + id + " ";
			RowMapper<User> mapper = new RowMapper<User>() {
				public User mapRow(ResultSet rs, int rowNum)
					 throws SQLException {
					 User p = new User();
					 p.setId(rs.getInt("id"));
					 p.setFirst_name(rs.getString("first_name"));
					 p.setLast_name(rs.getString("last_name"));
					 p.setEmail(rs.getString("email"));
					 p.setHobbies1(rs.getInt("hobbies1"));
					 p.setHobbies2(rs.getInt("hobbies2"));
					 p.setHobbies3(rs.getInt("hobbies3"));
					 p.setInterest(rs.getInt("interest"));
					 p.setPassword(rs.getString("password"));
					 return p;
				}
			};
			return simpleJdbcTemplate.queryForObject(sql, mapper);
		} catch (Exception e) {
			System.out.println("under. exception..." + e);
			// TODO: handle exception
			return null;
		}

	}
	
	public int AddUser(String first_name,String last_name,String email, String password,String username,Integer interest) 
	{
		
		try {
		
	Map<String, Object> param = new HashMap<String, Object>();

	param.put("first_name", first_name);
	param.put("last_name", last_name);
	param.put("email", email);
	param.put("password", password);
	param.put("username", username);
	param.put("interest", interest);
	

	Integer count=addusers.executeAndReturnKey(param).intValue();

	return count;
		} catch (Exception e) {
			System.out.println("eeee"+e);
			return 0;
			// TODO: handle exception
		}
			
		}
	
	
	public int AddProfile(Integer user_id) 
	{
		
		try {
		
	Map<String, Object> param = new HashMap<String, Object>();

	param.put("user_id", user_id);
	
	

	Integer count=addhobbies.executeAndReturnKey(param).intValue();

	return count;
		} catch (Exception e) {
			System.out.println("eeee"+e);
			return 0;
			// TODO: handle exception
		}
			
		}

	
	public boolean CheckAlreadyExist(String email) {
	    try {
		    		String sql = "select COUNT(id) from users where email='"+email.trim()+"'  ";
		    		Integer result=simpleJdbcTemplate.queryForObject(sql,Integer.class);
		    	if(result!=null && result.intValue()>0)
		    	{
		    		return true;
		    	}
		    	else
		    	{
		    		return false;
		    	}
		    	
		    		
			} catch (Exception e) {
				// TODO: handle exception
				
				return false;
			}
		}
	
	public int updatehobbies(Integer user_id, Integer hobbies1, Integer hobbies2,Integer hobbies3) {
		
		try {
			Integer count = 0;
				count = this.simpleJdbcTemplate
						.update("update hobbies set hobbies1=?,hobbies2=?,hobbies3 =? where user_id = ? ",
								hobbies1, hobbies2, hobbies3, user_id);
				

			return count;
		} catch (Exception e) {
			System.out.println("interest......"+e);
			return 0;
			// TODO: handle exception
		}

	}
	
	
	public int updateprofile(Integer id, String first_name, String last_name,
			String email,String password,Integer interest) {
		
		try {
			Integer count = 0;
				count = this.simpleJdbcTemplate
						.update("update users set first_name=?,last_name=?,email =?, password=?,interest=? where id = ? ",
								first_name, last_name, email, password,interest, id);
				

			return count;
		} catch (Exception e) {
			System.out.println("interest......"+e);
			return 0;
			// TODO: handle exception
		}

	}
	
	
	
}
