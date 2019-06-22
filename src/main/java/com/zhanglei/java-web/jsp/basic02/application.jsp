<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<% 
			application.setAttribute("city","beijing");
			application.setAttribute("name","lyons");
			application.setAttribute("hobby","music");
		%>
		
		<%= application.getAttribute("city") %><br>
		
		JSP(SERVLET)引擎名以版本号：<%= application.getServerInfo() %>
</body>
</html>