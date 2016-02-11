package a004;

import java.io.File;

public class DeleteDir
{

	/**
	 * 删除目录以及目录下文件
	 * 思路：由里到外删除
	 * @param args
	 */
	public static void main(String[] args)
	{
		File dir = new File("K:\\我的自学资料");
		
		deleteDir(dir,0);
	}

	private static void deleteDir(File dir,int level)
	{
		System.out.println(getSpace(level)+dir.getName());
		level++;
		File[] files = dir.listFiles();
		
		for (File file : files)
		{
			if (file.isDirectory())
			{
					deleteDir(file,level);
			}else
				{
					System.out.println(getSpace(level)+file.getName()+file.delete());
				}
		}
		
		System.out.println("空空空--"+dir.getName()+dir.delete());//删除空文件夹
		
	}
	
	/**
	 * 按照目录分级进行空格
	 * @param 空格数目
	 * @return 空格
	 */
	private static String getSpace(int level)
	{
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < level; i++)
		{
			sb.append("  ");
		}
		return sb.toString();
	}

}
