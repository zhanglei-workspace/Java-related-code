package charStream;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A003BufferedWrite
{

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");//调用系统的换行方式

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
	
		FileWriter fw = new FileWriter("K:\\write.txt");
		
		
		//提高效率，使用字符流缓冲区
		//创建一个字符写入流的对象,与要被缓冲的对象关联
		BufferedWriter bufw = new BufferedWriter(fw);
		
		
		//使用缓冲区的方法进行操作
		bufw.write("我是通过缓冲区过来的"+LINE_SEPARATOR+"我是换行过来的");
		bufw.flush();
		
		
		bufw.close();//关闭缓冲流，但要先刷新它。 其实是关闭写入流
		
		
		
	}

}
