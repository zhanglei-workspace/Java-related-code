package charStream;

import java.io.FileReader;
import java.io.IOException;

public class A002FileReader01
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
		FileReader fr = new FileReader("E:\\rabbish all\\Temp\\iowrite.txt");
		
//		int ch = fr.read();返回的是int 型
		int length = 0;
		while ((length=fr.read())!=-1) //因为当一个文件被读取完毕之后返回值为-1
		{
			System.out.print((char)length); // char 的作用是将读取到的ASCII码值转换为字符串 
		}
	}

}
