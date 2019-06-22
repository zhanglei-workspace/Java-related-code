<%@ page language="java" contentType="text/html; charset=UTF-8" errorPage="exception.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>异常产生页面</title>
</head>
<body>
	<%
	
		out.println(10/0);//制造运行异常
	%>
</body>
</html>