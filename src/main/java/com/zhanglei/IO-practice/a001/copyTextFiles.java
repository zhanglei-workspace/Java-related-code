package a001;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class copyTextFiles
{

	private static final int BUFFER_SIZE = 1024;

	/**
	 * 复制文本文件 D:\\fg.ini ---> k:\\copy.txt
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
/*		copy_1(); //自制缓冲区
		copy_2();//使用buffered缓冲区
*/		copy_3();
	}
	
	private static void copy_1() throws IOException
	{
			
		//低效率的复制，下面是利用行缓冲区高效率的copy
		FileReader fr = new FileReader("D:\\fg.ini");
		FileWriter fw = new FileWriter("k:\\copy2.txt",true);
		char[] buf = new char[BUFFER_SIZE]; //自己new缓冲区
		int length = 0;
		while ((length=fr.read(buf))!=-1) //jdk1.80 就报错，看来这玩意儿现在没这样玩的了
		{
			fw.write(new String(buf,0,length));
		}
		
		fr.close();
		fw.close();
	}

	private static void copy_2() throws IOException
	{
		FileReader fr = new FileReader("D:\\fg.ini");
		BufferedReader bufr = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("k:\\copy1.txt",true);
		BufferedWriter bufw = new BufferedWriter(fw);
		
		
		String line = null;
		while ((line=bufr.readLine())!=null)
		{
			bufw.write(line);
			bufw.newLine(); //换行
			bufw.flush();
		}
		
		bufr.close();
		bufw.close();
		
	}

	/**
	 * 读取时，字节流转换为字符流
	 * 写入时，字符流转换为字节流
	 * @throws IOException
	 */
	public static void copy_3() throws IOException
	{
		BufferedReader bufr = new BufferedReader(new InputStreamReader((new FileInputStream("D:\\fg.ini")),"GBK")); //FIleInputStream 能处理所有处理所有类型的数据，可以指定码表（指定码表必须用转换流）
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter((new FileOutputStream("k:\\copy3.txt"))));
		
		
		String line = null;
		while ((line=bufr.readLine())!=null)
		{
			bufw.write(line);
			bufw.newLine(); //换行
			bufw.flush();
		}
		
		bufr.close();
		bufw.close();
	}
	
	
	
	

}



