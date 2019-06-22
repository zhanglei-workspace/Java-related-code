<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<!-- 普通登录验证 -->
		<div id="" align="center">
			<div>
				<a href="#"> <img src="image/logo.png" alt="logo"> </a>
			</div>
			<hr><br>
			<div id="login">
				<form action="validate.jsp" method="post">
					
						<label> username：</label>
							<input name="name" value="">
						<label> password：</label>
							<input type="password" name="pass" value="">
						
						<input type="submit" value="submit">
				</form>
			</div>
		</div>
</body>
</html>