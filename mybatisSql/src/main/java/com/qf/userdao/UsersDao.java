package com.qf.userdao;

import java.util.List;
import java.util.Map;

import com.qf.mode.Users;

public interface UsersDao {
	public void userp(Map<?, ?> m);
	
	public List<Users> finduser();
	
	public void inout(Map<?, ?> m);
	
	public void zy(Map m);
}
