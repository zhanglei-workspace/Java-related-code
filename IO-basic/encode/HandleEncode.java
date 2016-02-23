package encode;

import java.io.IOException;

public class HandleEncode
{

	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		//编码正确，解码(iso8859-1)错误的处理方法
		demo1();
		
		/*
		 * 新建一个文本文件，在该文本文件中输入“联通”两个字符，保存并关闭文本文件。重新打开文本文件，发现文本文件中出现了乱码。
		 * 原因 输入“联通”字符时，使用的是系统默认的中文编码表GBK，而文本文件是一个应用程序，它默认使用的是UTF-8编码，所以再次打开时会出现乱码。
         * 解决方法：所有当保存文本文件时，选择另存为UTF-8编码方式，就不会出现乱码了。
		 */
	}

	public static void demo1() throws IOException
	{
		String str = "你好世纪";
		byte[] buf = str.getBytes("GBK");
		
		//解码错误
		String str1 = new String(buf,"iso8859-1");
		System.out.println(str1);
		
		//处理错误的解码
		byte[] str2 = str1.getBytes("iso8859-1"); //获取源字节
		String buf2 = new String(str2,"GBK");
		
		System.out.println(buf2);//测试是够成功
	}

}
