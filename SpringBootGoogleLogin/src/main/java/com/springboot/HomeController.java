package com.springboot;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController 
{
	@RequestMapping("/login")
	public String login() 
	{
		return "Hello User";
	}
	
	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principal) 
	{
		return principal;
	}
	
	@RequestMapping("/homepage")
	public String homePage() 
	{
		return "homepage";
	}
}
