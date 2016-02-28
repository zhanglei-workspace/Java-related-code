package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		System.out.println("By get");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTf-8");//指定输出类型，字符编码
		out.print("<b>hello world     get</b>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		System.out.println("By post");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTf-8");//指定输出类型，字符编码
		out.print("<b>hello world   post</b>");
	}
	
}
