package a003;

import java.io.File;

public class AlldirTest
{

	/**
	 * 深度遍历指定目录所有文件
	 * @param args
	 */
	public static void main(String[] args)
	{
		File dir = new File("E:\\我的自学资料");
		allDir(dir,0);
	}

	private static void allDir(File dir,int level)
	{
		System.out.println(printSpace(level)+dir.getName());
		level++;//空格计数器
		File[] files = dir.listFiles();
		
		for (File file : files)
		{
			//是目录继续递归遍历，否则直接打印
			if (file.isDirectory())
			{
				allDir(file, level);
			} else
				{
					System.out.println(printSpace(level)+file.getName());
				}
		}
	}
	
	/**
	 * 按照目录分级进行空格
	 * @param 空格数目
	 * @return 空格
	 */
	private static String printSpace(int level)
	{
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < level; i++)
		{
			sb.append("   ");
		}
		return sb.toString();
	}

}
