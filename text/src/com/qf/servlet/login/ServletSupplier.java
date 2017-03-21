package com.qf.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.qf.dao.DaoSuppers;
import com.qf.mod.Suppliers;

public class ServletSupplier extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
	
		PrintWriter out= response.getWriter();
		request.getSession().setAttribute("al", new DaoSuppers().allSup());
	List<Suppliers>	al=new DaoSuppers().allSup();
		Gson gs=new Gson();
		String s=gs.toJson(al);
	
		out.print(s);
	}

}
