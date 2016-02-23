package encode;

import java.io.IOException;

public class EncodeDemo
{

	/**
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException
	{
		/*
		 * 你好： GBK -60 -29 -70 -61
		 * 你好： UTF-8  -28 -67 -96 -27 -91 -67
		 */
		String str = "你好";
		
		//编码
		byte[] buf = str.getBytes("UTF-8");
		
		printBuf(buf);
		
		//解码
		String str1 = new String(buf,"UTF-8");
		
		System.out.println(str1);
	}

	public static void printBuf(byte[] buf)
	{
		for (byte b : buf)
		{
			System.out.print(b+" ");
		}
	}

}
