package charStream;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A003BufferedReader
{

//	private static final String LINE_SEPARATOR = System.getProperty("line.separator");//调用系统的换行方式

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
	
		FileReader fr = new FileReader("k://copy.txt");
		
		BufferedReader bufr = new BufferedReader(fr);
		
		String line = null;
		while ((line=bufr.readLine())!=null) //readline() 读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行。  达到流末尾返回null
		{
			System.out.println(line);
		}
		
		bufr.close();
		
		
		
	}

}
