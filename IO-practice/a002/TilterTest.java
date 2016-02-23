package a002;

import java.io.File;

public class TilterTest
{

	/**
	 * 1.过滤隐藏文件
	 * 2.按照文件名称过滤文件
	 * 3.按照任意指定的文件后缀过滤文件
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		
//		hiddenDemo();//隐藏文件
		
//		dirDemo(); // 2.按照文件名称过滤文件
		
		suffixDemo();//3.按照任意指定的文件后缀过滤文件
		
		

	}
	/**
	 * 
	 * @param 
	 * @return void
	 */

	private static void suffixDemo()
	{
		File dir = new File("C://");
		
		String[] name = dir.list(new Suffixfilter(".dll"));
		
		for (String string : name)
		{
			System.out.println(string);
		}
		
	}

	
	private static void hiddenDemo()
	{
		File dir = new File("C://");
		
		File[] names = dir.listFiles(new FilterByHidden());
		
		for (File file : names)
		{
			
			System.out.println(file);
			
		}
		
	}

	private static void dirDemo()
	{
		File dir = new File("C://");
		
		String[] name = dir.list(new FilterByJava());
		
		for (String string : name)
		{
			System.out.println(string);
		}
	}
	
	
	

}
