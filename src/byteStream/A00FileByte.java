package byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class A00FileByte
{


	/**
	 * 操作文件，比如图片/mp3、mp4 等
	 * 创建字节输出流。方法与字符流类似
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		demo_write();
		demo_reader();
	}

	public static void demo_reader() throws IOException
	{
		FileInputStream fis = new FileInputStream("K:\\bytefile.txt");
		
		int ch = fis.read();
		System.out.println((char)ch);
		
		System.out.println(fis.available()); //返回字节
		
		fis.close();
		
	}

	public static void demo_write() throws IOException
	{
		//创建字节输出流,不需要临时缓冲，直接写入目的地中
		FileOutputStream fos = new FileOutputStream("K:\\bytefile.txt",true);
		
		fos.write("helloworldbyte".getBytes());
		
		fos.close();
		
		
	}

}
