<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<% 
			//防止空指针异常
			String user = "";
			if((session.getAttribute("user"))!=null)
			{
				user = session.getAttribute("user").toString();
			}
		%>
		<font color="red"><%= user %></font>,Welcome to here.
</body>
</html>