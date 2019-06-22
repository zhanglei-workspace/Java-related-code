<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="java.text.*"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<% 
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日 HH:mm:ss");//格式化日期
		  	Date date = new Date(session.getCreationTime());//获取seeion创建时间
		  	
		  	session.setAttribute("user","admin");//设置会话用户名
		  	session.setAttribute("pass","123456");
		  	session.setAttribute("age",20);
		  	
		  	//设置session最大生存周期
		  	session.setMaxInactiveInterval(100);//10秒
		  	
		  	
		%>
		
		
		session创建时间：<%= sdf.format(date) %><br>
		session的ID编号: <%= session.getId() %><br>
		获取会话的用户名：<%= session.getAttribute("user") %><br>
		
		获取session设置的属性：
						<% 
							String[] info = session.getValueNames();
							for(String str:info)
							{
								out.print(str+"&nbsp;&nbsp;");
							}
						%>	
			
		
</body>
</html>