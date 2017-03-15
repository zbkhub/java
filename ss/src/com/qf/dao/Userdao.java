package com.qf.dao;

import org.springframework.stereotype.Repository;

import com.qf.mod.User;
@Repository
public interface Userdao {
	
	public User alluser();
	
}
