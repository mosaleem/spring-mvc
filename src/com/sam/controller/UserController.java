package com.sam.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sam.dao.UserDao;
import com.sam.pojo.User;
@Controller
public class UserController {

	@Autowired
	HttpSession session;

	@Resource(name = "UserDao")
	private UserDao userDao;
	
	@RequestMapping(value = "/users/login")
	public String login() {
		System.out.println("logn page");
		try {
			if (session.getAttribute("users_first_name") != null) {
				return "redirect:/users/"
						+ (String) session.getAttribute("users_first_name");
			} else {
				return "users/login";
			}
		} catch (Exception e) {
		}
		System.out.println("Login page+cdddd");
		return "users/login";
	}
	@RequestMapping(value = "/users/login_page")
	public String login_page() {
		System.out.println("logn page");
		try {
			if (session.getAttribute("users_first_name") != null) {
				return "redirect:/users/"
						+ (String) session.getAttribute("users_first_name");
			} else {
				return "users/login1";
			}
		} catch (Exception e) {
		}
		System.out.println("Login page+cdddd");
		return "users/login1";
	}

	
	
	
	

	
	@RequestMapping(value = "/users_resigter")
	public String users_resigter(
			@RequestParam(value = "first_name", required = false) String first_name,
			@RequestParam(value = "last_name", required = false) String last_name,
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "passw", required = false) String passw)

	{
		try {
			if(email!=null && !email.trim().equals("") && passw!=null && !passw.trim().equals(""))
			{ 
			

			if(userDao.CheckAlreadyExist(email))
			{
				return "redirect:registration?already_exist=true";
			}
			else
			{
			String username=first_name;
			Integer interest=0;
			Integer add=userDao.AddUser(first_name,last_name,email,passw,username,interest);
			
		

			if(add!=null && add.intValue()>0)
			{
				Integer profile=userDao.AddProfile(add);
				
				
				User user = userDao.findById(add);
				
				session.setAttribute("users_login", "success");
				session.setAttribute("users_id", add);
				session.setAttribute("users_first_name", user.getFirst_name());
				session.setAttribute("users_last_name", user.getLast_name());
				session.setAttribute("users_email", user.getEmail());
		    
				return "redirect:/users/"
				+ (String) session.getAttribute("users_first_name");
			}
			else
			{
				return "redirect:/index/registration?=failed";
 
			}
			}
			}
			else
			{
				return "redirect:/index/registration?=error";
			}
		} catch (Exception e) {
			
			System.out.println("sss"+e);
			
			
			return "redirect:/index/registration?=error";

			// TODO: handle exception
		}
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/users_login")
	public String users_login(
	
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "passw", required = false) String passw)

	{
		try {

			Integer login = userDao.loginCheck(email, passw);
			if (login != null && login.intValue() > 0) {
				User user = userDao.findById(login);
				
				session.setAttribute("users_login", "success");
				session.setAttribute("users_id", login);
				session.setAttribute("users_first_name", user.getFirst_name());
				session.setAttribute("users_last_name", user.getLast_name());
				session.setAttribute("users_email", user.getEmail());
				session.setAttribute("users_phone", user.getPhone());
				
				
				
				
				return "redirect:/users/"
						+ (String) session.getAttribute("users_first_name");
			} else {
				// System.out.println("failed");
				return "redirect:/users/login?login=failed";
			}

		} catch (Exception e) {
			return "redirect:/users/login?=failed";
		}

	}
	
	
	
	
	
	
	
	@RequestMapping(value = "/users/{param}")
	public String pro_dashboard(@PathVariable(value = "param") String param,
			Model model) {

		try {
			
			System.out.println("param"+param);
			System.out.println("session user first name"+session.getAttribute("users_first_name"));
			
			if (session.getAttribute("users_email") != null && session.getAttribute("users_first_name").equals(param)) {
				Integer id = Integer.parseInt(session.getAttribute("users_id").toString());
				
				User user = userDao.findById(id);
				model.addAttribute("user",user) ;
				
				System.out.println(user.getHobbies2());
				
				
				
				return "users/dashboard";
			} else {
				return "users/error";
			}
		} catch (Exception e) {
		}
		return "users/error";
	}
	
	
	@RequestMapping(value = "/users/edit_users")
	public String edit_users(
			@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "first_name", required = false) String first_name,
			@RequestParam(value = "last_name", required = false) String last_name,
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "password", required = false) String password,
			@RequestParam(value = "hobbies1", required = false) Integer hobbies1,
			@RequestParam(value = "hobbies2", required = false) Integer hobbies2,
			@RequestParam(value = "hobbies3", required = false) Integer hobbies3,
			@RequestParam(value = "interest", required = false) Integer interest)

	{

		
		System.out.println("id....."+id);
		System.out.println("first_name...."+first_name);
		System.out.println("last_name....."+last_name);
		System.out.println("email......"+email);
		System.out.println("password....."+password);
		System.out.println("hobbies1....."+hobbies1);
		System.out.println("hobbies2....."+hobbies2);
		System.out.println("hobbies3....."+hobbies3);
		System.out.println("interest......"+interest);
		
		try {

			userDao.updateprofile(id,first_name, last_name, email,password,interest);
			
			userDao.updatehobbies(id,hobbies1, hobbies2, hobbies3);
			
			
			return "redirect:/users/"
			+ (String) session.getAttribute("users_first_name")+"?update=success";
			

		} catch (Exception e) {
		}
		return "redirect:/users/"
		+ (String) session.getAttribute("users_first_name")+"?update=error";
		
	}

	
	
	
	
	
	
	
	
	@RequestMapping(value = "/users/logout")
	public String logout() {

		try {
			session.removeAttribute("users_id");
			session.removeAttribute("users_login");
			session.removeAttribute("users_first_name");
			session.removeAttribute("users_last_name");
			session.removeAttribute("users_email");
			session.removeAttribute("users_phone");
			

		} catch (Exception e) {
		}

		return "redirect:/users/login";

	}
	
	
}
