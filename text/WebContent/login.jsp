<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>系统登录 - 超市账单管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="jslib/jquery-3.1.1.min.js"></script>
<script>
	function fc() {
	var s=document.getElementsByTagName("p");
	s[0].innerHTML="";
	}
	function ubl() {
		var $s=$(".input-text").val();
		
		if($s==""){
			$(".incl").html("账号不能为空");
		}else{
			$(".incl").html("");
		}
	}
	function pbl() {
		var $s=$("[name=passWord]").val();
		
		if($s==""){
			$(".pcl").html("密码不能为空");
		}else{
			$(".pcl").html("");
		}
	}

</script>
</head>
<body class="blue-style">
<div id="login">
	<div class="icon"></div>
	<div class="login-box">
		<form method="post" action="ServletLogin">
			<dl>
				<dt>用户名：</dt>
				<dd><input type="text" name="userName" class="input-text" onfocus="fc()" onblur="ubl()"/><span class="incl"></span></dd>
				<dt>密　码：</dt>
				<dd><input type="password" name="passWord" class="input-text"  onfocus="fc()" onblur="pbl()"/><span class="pcl"></span></dd>
			</dl>
			<p style="text-align: center;color: red;font-size: 16px">${meg}</p>
			<%session.invalidate(); %>
			<div class="buttons">
				<input type="submit" name="submit" value="登录系统" class="input-button" />
				<input type="reset" name="reset" value="重　　填" class="input-button" />
			</div>
		</form>
	</div>
</div>
</body>
</html>
