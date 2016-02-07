package charStream;

import java.io.FileReader;
import java.io.IOException;


public class A002FileReader02
{

	/**
	 * @param args
	 * 读取一个文件内容，将其打印到控制台
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		/*
		 * 创建读取字符流的对象
		 */
		FileReader fr = new FileReader("C:\\Users\\u\\Desktop\\各种进程\\各种进程.txt");
		
		/*
		 * 使用read(char[])读取数据
		 * 先创建字符数组
		 */
		 char[] buf = new char[1024];
//		 int length = fr.read(buf); //将读取到的字符存储到数组中，num为读取到的个数
		 
		 int length = 0;
		 
		 while ((length=fr.read(buf))!=-1)
		{
			
			 System.out.println("长度："+length+"\n\n\n"+new String(buf,0,length)+"\t");
		}
		 
	}

}
