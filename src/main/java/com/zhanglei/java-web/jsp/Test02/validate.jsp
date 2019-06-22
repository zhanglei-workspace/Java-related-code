<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<jsp:useBean id="daoUser" class="dao.DaoUser"></jsp:useBean>
<jsp:useBean id="user" class="entity.User"></jsp:useBean>
<jsp:setProperty name="user" property="*" />

<% 
	request.setCharacterEncoding("UTF-8");
	
	if(daoUser.DaoUSer(user))
	{
		//将用户名传递到session中
		session.setAttribute("users",user.getUsername());
	
		//请求转发
		request.getRequestDispatcher("welcome.jsp").forward(request,response);
	}else
		{
			//请求重定向
			response.sendRedirect("login.jsp");
		}
%>