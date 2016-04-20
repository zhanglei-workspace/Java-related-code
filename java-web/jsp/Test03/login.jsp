<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="java.net.URLDecoder"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
								<!-- cookie 记录保存用户登录状态 -->
		
		<% 
			request.setCharacterEncoding("UTF-8");
			
			//获取之前的cookie信息
			
			String name = "";
			String pass = "";
			Cookie[] cookies = request.getCookies();
			if(cookies!=null && cookies.length>0)//以前有cookie信息
			{
				for(Cookie c:cookies)
				{
					if("username".equals(c.getName())) //username是之前存储cookie时设置的键
					{
						//取值并解码
						name = URLDecoder.decode(c.getValue(),"UTF-8"); //判断得到cookie中有用户名将其赋值给name
					}
					
					if("password".equal(c.getName()))
					{
						pass = URLDecoder.decode(c.getValue(),"UTF-8");//判断得到cookie中有密码将其赋值给pass
					}
				}
			}
			
		%>
		
		<!-- 登录界面 -->
		<div id="" align="center">
			<div>
				<a href="#"> <img src="image/logo.png" alt="logo"/> </a>
			</div>
			<hr><br>
			<div id="login">
				<form action="validate.jsp" method="post">
					<table>
						<tr>
							<td>username：</td>
							<td><input name="username" value="<%= name %>"></td> <!-- vaule by cookie -->
						</tr>
						<tr>
							<td>password：</td>
							<td><input type="password" name="password" value="<%= pass %>"></td> <!-- vaule by cookie -->
						</tr>
						<tr>
							<td><input type="checkbox" name="isCookie" checked="checked">记住密码</td>
							<td><input type="submit" value="提交"></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
</body>
</html>