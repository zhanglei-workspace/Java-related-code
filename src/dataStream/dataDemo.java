package dataStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataDemo
{

	/**
	 * 操作基本数据类型
	 * DataStream
	 * 存储时带有UTF-8 修改版表头
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
//		WriteData();
		ReadData();
	}

	public static void ReadData() throws IOException
	{
		DataInputStream dis = new DataInputStream(new FileInputStream("K:\\11\\hello.txt"));
		
		String str = dis.readUTF();
		
		System.out.println(str);
		
		dis.close();
		
	}

	public static void WriteData() throws IOException
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("K:\\11\\hello.txt"));
		
		dos.writeUTF("中文字符");
		
		dos.close();
	}

}
