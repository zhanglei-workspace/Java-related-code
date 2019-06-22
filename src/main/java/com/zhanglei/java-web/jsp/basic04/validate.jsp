<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<jsp:useBean id="login" class="entity.User" scope="page"></jsp:useBean>
		
		<%--  
			<!-- 根据表单自动匹配JavaBean所有属性: -->
			<jsp:setProperty name="login" property="*" />
			
			username<%= login.getUsername() %>
			<%= login.getPassword() %><br>
		--%>
		
		<%-- 
			<!-- 与表单无关，手工配置JavaBean属性: -->
			<jsp:setProperty name="login" property="username" value="world" />
			
			<%= login.getUsername() %>
			<%= login.getPassword() %><br>
		--%>
		
		<%-- 
			<!-- 通过URL传参给属性 -->
			<jsp:setProperty name="login" property="username" param="name" /> <!-- 获取url参数传递的username值 -->
			<jsp:setProperty name="login" property="password" /> 	<!-- 自动获取password值 -->
			
			<%= login.getUsername() %>
			<%= login.getPassword() %><br>
		--%>
		
		<jsp:setProperty name="login" property="*" />
		<!-- 用getproperty获取属性的值 -->
		<jsp:getProperty name="login" property="username" />
		<jsp:getProperty name="login" property="password" />
</body>
</html>