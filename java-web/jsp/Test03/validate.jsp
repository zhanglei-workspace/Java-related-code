<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="java.net.URLEncoder"%>

<!-- 处理cookie信息。 -->
<% 
	request.setCharacterEncoding("UTF-8");
	
	String[] cookie = request.getParameterValues("isCookie");
	if(cookie!=null && cookie.length>0)//用户选择了免登陆按钮
	{
		//将用户名和密码保存在cookie对象里
		String username = URLEncoder.encode(request.getParameter("username"),"UTF-8");//取值并编码，URLencoder编码解决cookie中
		String password = URLEncoder.encode(request.getParameter("password"),"UTF-8");//				无法保存中文字符串的问题
		Cookie nameCookie = new Cookie("username",username); //设置cookie键值对（双引号内自己起名），记住键，方便登录时取值
		Cookie passCookie = new Cookie("password",password);
		
		nameCookie.setMaxAge(86400);//设置生存期限，单位：秒
		passCookie.setMaxAge(86400);
		
		response.addCookie(nameCookie);//保存信息
		response.addCookie(passCookie);
	}else
		{
			Cookie[] cookies = request.getCookies();
			if(cookies!=null && cookies.length>0)//刚刚提交的cookie有值
			{
				for(Cookie c:cookies)
				{
					if("username".equals(c.getName())||"password".equals(c.getName())) //Cookie 信息中有用户名和密码
					{
						c.setMaxAge(0);//设置cookie失效
						response.addCookie(c);//重新保存
					}
				}
			}
	
		}
%>

<jsp:useBean id="daoUser" class="dao.DaoUser"></jsp:useBean>
<jsp:useBean id="user" class="entity.User"></jsp:useBean>
<jsp:setProperty name="user" property="*" />

<!-- 处理登录信息 -->
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