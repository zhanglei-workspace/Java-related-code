package charStream;


import java.io.FileWriter;
import java.io.IOException;

public class A001Write01
{

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");//调用系统的换行方式

	/**
	 * @param args
	 * 字符流，操作文本文件，比如txt,ini等文本文
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
	
		/* 
		 * 创建一个可以往文件中写入字符数据的 字符输出流对象。
		   创建对象时就就必须写明该文件的储存地址
		   *
		   *文件存在，则覆盖。文件不存在，则创建该文件。(如果构造函数中加入true则不覆盖，而是续写)
		   */
		FileWriter fw = new FileWriter("E:\\rabbish all\\Temp\\iowrite.txt",true);
	
		/*
		 * 调用write对象中的write（String）方法，写入数据
		 * 其实数据写入到了临时缓冲区中
		 */
			fw.write("张磊resgseg\rfsd更舒服fs神来了\n"+LINE_SEPARATOR+"前面这个LINE_SEPARATOR是换行用的"); // /n虽然不能再记事本中被识别，但是在底层/n是被储存了（将读取到的文件打印到控制台可证明）
/*		
		 * 进行刷新，将缓冲区的数据写入目标文件
		 */
			fw.flush();
		 
	   //关闭流
			fw.close();//关闭前会先调用flush()将缓冲区的信息写入到目的地
		
		
	}

}
