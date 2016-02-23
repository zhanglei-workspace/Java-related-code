package a007;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SplitFilesDemo
{

	private static final int SIZE = 1024*1024;

	/**
	 * 自制文件切割器
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		File file = new File("K:\\11\\左边.mp3");
		
		splitFiles(file);
	}

	/**
	 * 切割目标文件将碎片存储到指定目录下
	 * @param file
	 * @throws IOException
	 */
	private static void splitFiles(File file) throws IOException
	{
		FileInputStream fis = new FileInputStream(file);
		
		FileOutputStream fos = null;
		
		File dir = new File("K:\\11\\store");//切割的碎片存储目录
		if (!dir.exists())
		{
			dir.mkdir();
		}
		int count = 1;//切割的碎片后储存的文件名称
		
		//自制缓存区
		byte[] buf = new byte[SIZE];
		int len = 0;
		while ((len=fis.read(buf))!=-1)
		{
			fos = new FileOutputStream(new File(dir,(count++)+".part"));//创建空文件
			fos.write(buf,0,len);
		}
		
		fos.close();
		fis.close();
	}
	
	

}
