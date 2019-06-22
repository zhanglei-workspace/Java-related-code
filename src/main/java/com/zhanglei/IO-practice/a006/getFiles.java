package a006;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class getFiles
{

	/**
	 * 获取指定目录中的文件，将其按照扩展名存放到指定文件中
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		File dir = new File("K:\\11\\21");
		
		//过滤器
		FilenameFilter filter = new FilenameFilter(){
			public boolean accept(File dir, String name)
			{
				return name.endsWith(".txt");
			} 
		};
		
		
		List<File> list = new ArrayList<File>();
		
		getFile(dir,filter,list);
		
		File destFile = new File(dir,"myfiles.txt");
		
		writerFiles(list,destFile);
	}

	/**
	 * 按照指定目录中的内容进行深度遍历，并按照指定过滤器进行过滤
	 * 将过滤后的内容储存到list中 
	 * @param dir
	 * @param filter 
	 * @param list
	 */
	private static void getFile(File dir,FilenameFilter filter,List<File> list)
	{
		File[] files = dir.listFiles();
		
		for (File file : files)
		{
			if (file.isDirectory())
			{
				//递归
				getFile(file,filter,list);
			}else if (filter.accept(dir, file.getName())) 
					{
						list.add(file);
					}
		}
	}
	
	
	private static void writerFiles(List<File> list,File destFile) throws IOException
	{
		BufferedWriter bufw = null;
		
		try
		{
			bufw = new BufferedWriter(new FileWriter(destFile));
			for (File file : list)
			{
				bufw.write(file.getAbsolutePath());
				bufw.newLine();
				bufw.flush();
			}
			
		} catch (IOException e)
		{
			e.printStackTrace();
			throw new RuntimeException("写入失败");
		}finally
		{
			if (bufw!=null)
			{
				try
				{
					bufw.close();
				} catch (IOException e)
				{
					throw new RuntimeException("关闭流失败");
				}
			}
		}
		
	}
	
	
}
