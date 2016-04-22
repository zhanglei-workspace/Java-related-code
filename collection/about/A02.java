package about;

import java.io.IOException;

public class A02
{

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
		
		Runtime t = Runtime.getRuntime();
		Process p  = t.exec("notepad.exe C:\\000000mycenter\\cywin自制控制台.txt");//用记事本打开一个文件
		
		Thread.sleep(500);//等待700毫秒
		p.destroy();//关闭

	}

}
