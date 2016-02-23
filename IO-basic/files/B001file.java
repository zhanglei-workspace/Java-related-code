package files;

import java.io.File;


public class B001file
{

	/**
	 * 操作文件夹
	 * @param args
	 */
	public static void main(String[] args)
	{
		//将存在或者不存在的文件或目录封装成file对象
		
		
		File f1 = new File("k:\\a.txt");
		
		File f2 = new File("K:\\","a.txt");
		
		File f  = new File("K:\\");
		File f3 = new File("a.txt");
		
		File f4 = new File("C:",File.separator+"a.txt"); //File.separator：与系统有关的路径分隔符。 因为不同系统，内部的分隔符是不一样的  \\  ;
		System.out.println(f4);
		
	}

}
