<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>传递参数</title>
</head>
<body>
		<form action="register.jsp" method="post">
			<table>
			<tr>
				<td>姓名</td>
				<td><input name="name"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td>爱好：</td>
				<td>
					<input type="checkbox" name="hobby" value="reading">读书
					<input type="checkbox" name="hobby" value="writing">写作
					<input type="checkbox" name="hobby" value="music">音乐
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="submit">
					<input type="reset" value="reset">
				</td>
			</tr>
			</table>
			
		<br>
		<br>
		</form><a href="register.jsp?name=乱码问题测试">测试URL传参数</a>
</body>
</html>