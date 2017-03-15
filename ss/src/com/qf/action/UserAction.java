package com.qf.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qf.dao.Userdao;
import com.qf.mod.User;

@Controller

public class UserAction {
	@Autowired
	private Userdao ud;
	
	@RequestMapping("alluser")
	public String alluser(){
		
		User user = ud.alluser();
		return "s";
		
		
	}
	
}
