package com.qf.text;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import com.qf.mode.Users;
import com.qf.userdao.UsersDao;

public class Text {

	public static void main(String[] args){
		// userp();
		// finduser();
		
		// inout();
		 
		 try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			 SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
			 SqlSession session = build.openSession();
			 
			 Map<String,Object> hm= new HashMap<String, Object>();
			 hm.put("x", 1200);
			 UsersDao mapper = session.getMapper(UsersDao.class);
			 mapper.zy(hm);
			 
			 System.out.println("--"+hm.get("y"));
				session.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
	}




	private static void inout() {
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream("mybatis.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		 SqlSession session = sessionFactory.openSession();
		 Map<String,Object> m=new HashMap<String,Object>();
			m.put("x", 12);	 
		 UsersDao mapper = session.getMapper(UsersDao.class);
		 mapper.inout(m);
		 System.out.println(m.get("x"));
		 session.close();
	}




	private static void finduser() {
		try {
				InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				SqlSession session = sessionFactory.openSession();
				//User u = session.selectOne("com.qf.dao.UserDao.all",1);
			//	System.out.println(u.getName());
				
			List<Users> list = session.selectList("com.qf.userdao.UsersDao.finduser");
				for (Users user : list) {
					System.out.println(user.getId()+">>>>"+user.getUsername()+">>>"+user.getPricid());
				}

			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	

	private static void userp() {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
				SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				SqlSession session = sessionFactory.openSession();
				Map<String,Object> m=new HashMap<String,Object>();
				m.put("x", 15);
				//m.put("y", -1);
				UsersDao mapper = session.getMapper(UsersDao.class);
				mapper.userp(m);
				System.out.println("--"+m.get("y"));
				session.close();
		 
		 
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
