package com.qf.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.qf.dao.infter.DaoSuppAdd;
import com.qf.mod.Suppliers;

public class DaoSuppAddImp extends DaoAbase implements DaoSuppAdd{

	@Override
	public void suppAdd(Suppliers user) {
		bc();
		String sql="insert into supplier(id,name,describ,username,tel,addres) values(?,?,?,?,?,?);";
		PreparedStatement p = null;
		try {
			
			p=c.prepareStatement(sql);
			Integer id=(Integer)user.getId();
			p.setString(1, id.toString());
			p.setString(2, user.getName());
			p.setString(3, user.getDescribe());
			p.setString(4, user.getUsername());
			p.setString(5, user.getTel());
			p.setString(6, user.getAddres());
			p.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			if(p!=null){
				try {
					p.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
