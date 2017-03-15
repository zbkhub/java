<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>My JSP 'login.jsp' starting page</title>   
  </head> 
  <body>
      <form action="login" method="post">
         <label>账号:</label>
         <input type="text" name="name"><br/>
         <label>密码:</label>
         <input type="password" name="pwd"/><br/>
         <input type="submit" value="登录"/>
      </form>
  </body>
</html>
