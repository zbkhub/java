package com.qf.servlet.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qf.biz.SuppAddBiz;

public class ServletSuppAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sid=request.getParameter("proId");
		String name=request.getParameter("proName");
		String describe= request.getParameter("proDesc");
		String username=request.getParameter("contact");
		String tel=request.getParameter("phone");
		String addres=request.getParameter("address");
		if(sid==""){
			new SuppAddBiz().supplieradd(name, describe, username, tel, addres);
		}else{
			System.out.println();
			int id=Integer.parseInt(sid);
			new SuppAddBiz().supplieradd(id, name, describe, username, tel, addres);
		}
		response.sendRedirect("providerAdmin.jsp");
	}

}
