package files;

import java.io.File;

public class B003RootDir
{

	/**
	 * 根目录信息
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		rootNUm();
		
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

}
