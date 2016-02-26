<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<!--  通过url传参
			<form action="validate.jsp?name=heiheihei" method="post">
		-->
		
		<form action="validate.jsp" method="post">
		
			<label> username：</label>
				<input name="username">
			<label> password：</label>
				<input type="password" name="password">

			<input type="submit" value="submit" >
		</form>
</body>
</html>