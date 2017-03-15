package com.qf.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qf.modle.User;

@Controller
public class LogController {

	@RequestMapping("/login")
	   public String login(User u){
		 System.out.println("123");
		  UsernamePasswordToken token=new UsernamePasswordToken(u.getName(),u.getPwd());
		  Subject subject = SecurityUtils.getSubject();
		  try {
			  subject.login(token);
			  return "success";
		} catch (Exception e) {
			 return "login";
		}
		 
	   }
	
}
