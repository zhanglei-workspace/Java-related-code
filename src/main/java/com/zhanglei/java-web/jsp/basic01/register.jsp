<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<% request.setCharacterEncoding("UTF-8"); %> 
		<% 
			String name = request.getParameter("name");
			String pass = request.getParameter("pass");
			String[] hobbies = request.getParameterValues("hobby");
			
		%>
		
		name:<%= name %><br>
		pass:<%= pass %><br>
		hobbies:<br>
			<% 
				if(request.getParameter("hobbies")!=null)
				{
					for(String hobby:hobbies)
					{
						out.print(hobby+"&nbsp;&nbsp;");
					}
				}
			%>
</body>
</html>