<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="entity.User;"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>使用普通方式创建JavaBean实例</h1>
		<% 
			User user = new User();
			user.setUsername("lyons");
			user.setPassword("hello");
		%>
		<br>
		用户名：<%= user.getUsername() %><br>
		密码：  <%= user.getPassword() %><br>
</body>
</html>