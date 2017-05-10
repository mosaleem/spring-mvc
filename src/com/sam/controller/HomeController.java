package com.sam.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@Autowired
	HttpSession session; 
	
	@RequestMapping(value="/")
	public String home()
	{
		
	try {
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println("Home page");
		return "index";
	}
	

	
	
	
	

}
