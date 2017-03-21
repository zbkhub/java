package com.qf.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.qf.dao.infter.DaoSupplier;
import com.qf.mod.Suppliers;

public class DaoSuppers extends DaoAbase implements DaoSupplier {
		//供应商操作
	@Override
	public List<Suppliers> allSup() {
		List<Suppliers> al= new ArrayList<>();
		bc();
		try {
			Statement p=c.createStatement();
			String sql="select * from supplier;";
			ResultSet re=p.executeQuery(sql);
			while(re.next()){
				Suppliers user= new Suppliers();
				user.setId(re.getInt("id"));
				user.setName(re.getString("name"));
				user.setDescribe(re.getString("describ"));
				user.setUsername(re.getString("username"));
				user.setTel(re.getString("tel"));
				user.setAddres(re.getString("addres"));
				al.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return al;
	}

}
