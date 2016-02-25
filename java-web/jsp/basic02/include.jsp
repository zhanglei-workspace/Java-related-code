<%@ page language="java"  pageEncoding="UTF-8"%>
<%@page import="java.text.*"%>
<%@page import="java.util.Date"%>

<% 
		/* “include” Test page by pageContest.jsp */

		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		Date date = new Date();
		
		String s = sdf.format(date);
		out.println(s+"<br>");

%>
