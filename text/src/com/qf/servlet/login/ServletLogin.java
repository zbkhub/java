package com.qf.servlet.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qf.biz.LoginBiz;

public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("userName");
		String pwd= request.getParameter("passWord");
		LoginBiz lb= new LoginBiz();
		boolean result=lb.log(name, pwd);
		if(result){
			request.getSession().setAttribute("user",lb.qx());
			response.sendRedirect("admin_index.html");
		}else{
			request.getSession().setAttribute("meg","账号或密码错误");
			response.sendRedirect("login.jsp");
		}
	
	}

}
