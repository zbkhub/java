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
import com.qf.biz.SupplierCx;
import com.qf.mod.Suppliers;

public class ServletSuppCx extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	String name=request.getParameter("name");
	String describe=request.getParameter("describe");
	PrintWriter out= response.getWriter();
	List<Suppliers> al= new SupplierCx().suppCx(name, describe);
	Gson gs= new Gson();
	String s=gs.toJson(al);
	out.print(s);
	}

}
