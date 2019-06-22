<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="java.io.PrintWriter"%>

<% 
	response.setContentType("text/html; charset=UTF-8"); //设置响应的MIME类型
	
	out.print("<h1>response内置对象</h1>");
	//out.flush(); //刷新缓冲区，主要是解决 printwriter流对象输出总在最前面的问题.(测试请求转发和重定向时需要注释掉此刷新，否则抛异常)
	
	PrintWriter pw = response.getWriter();//获取输出流对象
	pw.println("我是response输出流对象生成的输出流对象pw");	
	
	
	
	//请求重定向,客户端行为，本质是两次请求，前一次请求的对象不会保存，URL地址会变
	//response.sendRedirect("request.jsp");
	
	//请求转发，服务器行为，一次请求，对象保存，URL不变。
	request.getRequestDispatcher("request.jsp").forward(request,response);
%>