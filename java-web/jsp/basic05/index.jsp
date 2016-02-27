<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<!-- forward页面跳转，param传参(也可以修改原来拥有的参数) -->
		<jsp:forward page="welcome.jsp">
			<jsp:param name="lyons" value="good"/>
		</jsp:forward>
</body>
</html>