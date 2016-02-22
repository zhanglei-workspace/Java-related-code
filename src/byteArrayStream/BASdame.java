package byteArrayStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class BASdame
{

	/**
	 * 操作字节数组 byteArrayStream
	 * 类似的有：
	 *       操作字符数组 CharArrayReader CharArrayWrite
	 *       操作字符串   StringReader StringWrite
	 * @param args
	 */
	public static void main(String[] args)
	{
		ByteArrayInputStream bais = new ByteArrayInputStream("abcde".getBytes());

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int ch = 0;
		while ((ch=bais.read())!= -1)
		{
			baos.write(ch);
		}
		
		System.out.println(baos.toString());
	}

}
