package files;

import java.io.File;

public class B003RootDir
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		rootNUm();
		
//		infoRoot();
		
	}
	
	private static void rootNUm()
	{
		File[] num = File.listRoots();
		
		
		System.out.println("Name"+"\tFreeSpace:"+"\tUsableSpace"+"\tTotalSpace");
		
		for (File file : num)
		{
			System.out.print(file+"\t");
			System.out.println(file.getFreeSpace()+"\t"+file.getUsableSpace()+"\t"+file.getTotalSpace()); //前俩好像不对
			System.out.println();
			
		}
	}

/*	*//**
	 * 
	 *//*
	private static void infoRoot()
	{
		File[] num = File.listRoots();
		
		int max = 0;
		String maxName = null;
		for (File file : num)
		{
			int len = Integer.parse); file.getUsableSpace().
			if (max<len)
			{
				maxName = file.getName();
			}
		}
		System.out.println("max:"+maxName);
		
	}
	*/
	

}
