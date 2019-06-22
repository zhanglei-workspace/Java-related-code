package byteArrayStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class BASdame
{

	/**
	 * SVN: '0x00400006: Validate Repository Location' operation finished with error: Selected SVN connector library is not available or cannot be loaded.
If you selected native JavaHL connector, please check if binaries are available or install and select pure Java Subversion connector from the plug-in connectors update site.
If connectors already installed then you can change the selected one at: Window->Preferences->Team->SVN->SVN Connector.
Selected SVN connector library is not available or cannot be loaded.
If you selected native JavaHL connector, please check if binaries are available or install and select pure Java Subversion connector from the plug-in connectors update site.
If connectors already installed then you can change the selected one at: Window->Preferences->Team->SVN->SVN Connector.
	 * 操作字节数组 byteArrayStream
	 * 类似的有：
	 *       操作字符数组 CharArrayReader CharArrayWrite
	 *       操作字符串   StringReader StringWrite
	 * @param args
	 */
	public static void main(String[] args)
	{
		ByteArrayInputStream bais = new ByteArrayInputStream("abcde".getBytes());//getBytes():将一个字符串转化为字节数组

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int ch = 0;
		while ((ch=bais.read())!= -1)
		{
			baos.write(ch);
		}
		
		System.out.println(baos.toString());
	}

}
