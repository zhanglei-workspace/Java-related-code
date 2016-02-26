<%@ page language="java" contentType="text/html; charset=UTF-8"%>

	<% 
		request.setCharacterEncoding("UTF-8");
		//防止空指针异常
		String user = "";
		if((session.getAttribute("users"))!=null)
		{
			user = session.getAttribute("users").toString();
		}
	%>
	<div align="center">
		<font color="red"><%= user %></font>,Welcome to here.
	</div>
