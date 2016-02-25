<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<% 
	request.setCharacterEncoding("UTF-8");
	
	String username = "";
	String password = "";
	
	username = request.getParameter("name");
	password = request.getParameter("pass");
	
	if("lyons".equals(username)&&"hello".equals(password))
	{
		//将用户名传递到session中
		session.setAttribute("user",username);
	
		//请求转发
		request.getRequestDispatcher("welcome.jsp").forward(request,response);
	}else
		{
			//请求重定向
			response.sendRedirect("login.jsp");
		}
%>