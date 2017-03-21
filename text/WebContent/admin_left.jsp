
<%@page import="com.qf.mod.LoginUser"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="css/style.css" />

<%-- <% 
	LoginUser user=(LoginUser)session.getAttribute("user");
		int i=	user.getQx();

%> --%>
</head>
<body class="frame-bd">
<ul class="left-menu">
	<li><a href="admin_bill_list.html" target="mainFrame"><img src="images/btn_bill.gif" /></a></li>
	<li><a href="providerAdmin.jsp" target="mainFrame"><img src="images/btn_suppliers.gif" /></a></li>
	<c:if test="${user.getQx()==2}">
	<li><a href="userAdmin.html" target="mainFrame"><img src="images/btn_users.gif" /></a></li>
	</c:if>
	<li><a href="ServletTc" onClick="javaScript:alert('这里实现退出操作！')"><img src="images/btn_exit.gif" /></a></li>
</ul>
</body>
</html>
