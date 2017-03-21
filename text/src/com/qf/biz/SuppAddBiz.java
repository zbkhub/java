package com.qf.biz;

import com.qf.biz.infter.SuppAdd;
import com.qf.dao.DaoSuppAddImp;
import com.qf.mod.Suppliers;

public class SuppAddBiz implements SuppAdd {

	@Override
	public void supplieradd(int id, String name, String describe, String username, String tel, String addres) {
	Suppliers user= new Suppliers();
	user.setAddres(addres);
	user.setId(id);
	user.setName(name);
	user.setDescribe(describe);
	user.setUsername(username);
	user.setTel(tel);
	new DaoSuppAddImp().suppAdd(user);
	
		
	}

	@Override
	public void supplieradd(String name, String describe, String username, String tel, String addres) {
		Suppliers user= new Suppliers();
		user.setAddres(addres);
		user.setName(name);
		user.setDescribe(describe);
		user.setUsername(username);
		user.setTel(tel);
		new DaoSuppAddImp().suppAdd(user);
		
	}

}
