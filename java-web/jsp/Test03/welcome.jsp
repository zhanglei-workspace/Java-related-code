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
		<hr>
	
		<!-- include指令将date.jsp页面包含进来 -->
			<%@ include file="date.jsp" %>|
		
		<!-- include动作将date.jsp页面包含进来 -->
			<jsp:include page="date.jsp" flush="true"></jsp:include>
	
	</div>