<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<% 
			request.setAttribute("Test","456");
		%>
		<br>
		测试：<%= request.getAttribute("Test") %>
		
		请求方法名字：	<%= request.getMethod() %><br>
		请求使用资源：	<%= request.getRequestURI() %><br>
		协议：	   	<%= request.getProtocol() %><br>
		服务器IP:		<%= request.getServerName() %><br>
		服务器端口号：	<%= request.getServerPort() %><br>
		客户端主机名：	<%= request.getRemoteAddr() %><br>
		表单提交的信息：<%= request.getParameter("username") %>
</body>
</html>