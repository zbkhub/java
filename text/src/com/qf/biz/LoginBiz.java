package com.qf.biz;

import java.util.List;

import com.qf.dao.DaoLogin;
import com.qf.mod.LoginUser;

public class LoginBiz {
	
	private LoginUser user;
	public boolean log(String name,String pwd){
		
		//调用dao类
		DaoLogin dao= new DaoLogin();
		user=dao.loginQury(name, pwd);
		if(user==null){
		return false;
		}else{
			return true;
		}
		
	}
	public LoginUser qx() {
		
		return user;
	}
	

}
