package com.qf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qf.mod.LoginUser;

public class DaoLogin extends DaoAbase {
	
	//private List<LoginUser> al= new ArrayList<LoginUser>();
	//登录操作
	public LoginUser loginQury(String name,String pwd){
		try {
			
			bc();
			
			String sql="select * from user where name=? and password=?;";
			PreparedStatement p=c.prepareStatement(sql);
			p.setString(1, name);
			p.setString(2, pwd);
		ResultSet re=p.executeQuery();
		if(re.next()){
			String uname=re.getString("name");
			String pas=re.getString("password");
			int sex=re.getInt("sex");
			int qx=re.getInt("qx");
			int age=re.getInt("age");
			String tel= re.getString("tel");
			String addres= re.getString("addres");
			int id=re.getInt("id");
			
			LoginUser user=new LoginUser();
			user.setAddres(addres);
			user.setAge(age);
			user.setId(id);
			user.setName(uname);
			user.setPwd(pas);
			user.setQx(qx);
			user.setTel(tel);
			user.setSex(sex);
			
			//al.add(user);
			return user;
		}
		if(re!=null){
			re.close();
		}
		if(p!=null){
			p.close();
		}
		if(c!=null){
			c.close();
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
