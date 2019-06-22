<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<jsp:useBean id="myentity" class="entity.User" scope="page"/>
		
		<h1>使用userBean进行对象实例化</h1> <br><hr>
		<%  
			myentity.setUsername("lyons");
			myentity.setPassword("hello");
		%>
		
		用户名：<%= myentity.getUsername() %><br>
		密码：<%= myentity.getPassword() %>
</body>
</html>