package files;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class B002fileMethod
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
//		getDemo();//获取文件的属性值
//		getDir();//目录操作
//		isDemo();//判断
//		rename();//粘贴or 重命名
		allDir();//获取当前目录下的文件和目录的名字（包括隐藏目录或文件夹）
		
	}
	
	/**
	 * 显示当前目录下文件和目录的名字
	 */
	private static void allDir()
	{
		File dir = new File("c://");//此地方封装的必须是目录，否则空指针异常
		
		String[] dirs = dir.list();
		
		for (String string : dirs)
		{
			System.out.println(string);
		}
		
		
	}


	private static void rename()
	{
		//当路径 file1=file2 时，重命名，否则，是粘贴。
		
		File file1 = new File("k://default.txt");
		
		File file2 = new File("E://a.txt");
		
		System.out.println(file1.renameTo(file2)); 
		
		
		
	}


	/**
	 * 判断文件是否存在，是目录嘛。是文件嘛
	 */
	private static void isDemo()
	{
		File file = new File("K:\\a.txt");
		
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
	}


	/**
	 * 对目录进行CRUD
	 * @throws IOException 
	 */
	
	private static void getDir() throws IOException
	{
		File dir = new File("k://dir//my//my.txt");
		
		//mkdir()   如果你想在已经存在的文件夹下建立新的文件夹），就可以用此方法。
		//          此方法不能在不存在的文件夹下建立新的文件夹。

		//mkdirs()  如果你想根据File里的路径名建立文件夹（当你不知道此文件夹是否存在，也不知道父文件夹存在），就可用此方法，
		//          它建立文件夹的原则是：如果父文件夹不存在并且最后一级子文件夹不存在，它就自动新建所有路经里写的文件夹；
		//          如果父文件夹存在，它就直接在已经存在的父文件夹下新建子文件夹。
		
		dir.mkdir();
		dir.mkdirs();
		
		dir.delete();
		
		boolean flag = dir.createNewFile();//当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
		System.out.println(flag);
	}

	/**
	 * 获取文件：
	 * 		名称
	 * 		路径
	 * 		大小
	 * 		修改时间
	 * 
	 */
	private static void getDemo()
	{
		File file = new File("k:\\myGitHub");
		
		String name = file.getName();
		
		String path1 = file.getAbsolutePath();//绝对路径
		String path2 = file.getPath();//相对路径
		
		long len = file.length();
		
		long time = file.lastModified();
		Date date = new Date(time);
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);  //没研究来着
		String date_format = dateFormat.format(date);
		
		
		
		System.out.println("name:"+name);
		System.out.println("path1:"+path1);
		System.out.println("path2:"+path2);
		System.out.println("len:"+len);
		
		System.out.println("time:"+time);
		System.out.println("date_format:"+date_format);
		
	}
	



}
