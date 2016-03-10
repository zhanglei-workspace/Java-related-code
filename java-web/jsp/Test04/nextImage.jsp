<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
		<jsp:useBean id="play" class="image.image" scope="session"/>
		<!-- 查看 下一张，上一张 图片 JavaBean在package/image.java中-->
		
		<% 
			String webDir = reqest.getContextPath();//获取当前web服务目录的名称
			webDir = webDir.substring(1);			//去掉名称前面的目录符号“/”
		%>
		<jsp:setProperty name="play" property="webDir" value="<%= webDir %>" />
		<jsp:setProperty name="play" property="imageNumber" value="<%= imageNumber %>" />

<body bgcolor=cyan>
	<font size=2>
		
		<image src = image/<jsp:getProperty name="play" property="playImage"/> width=120 height=90><br>这是当前显示的图像"</image>
		<br>点击“上一张”或“下一张”按钮浏览图像
		<form action="" menthod="post">
			<input type="submit" name="ok" value="上一张" />
			<input type="hidden" name="imageNumber" value="<%= paly.getImgeNumber()-1 %>" />
		</form>

		<form action="" menthod="post">
			<input type="submit" name="ok" value="下一张" />
			<input type="hidden" name="imageNumber" value="<%= paly.getImgeNumber()+1 %>" />
		</form>
	</font>
		
</body>
</html>