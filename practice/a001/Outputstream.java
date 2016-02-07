package a001;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Outputstream
{

	/**
	 * 需求：将中文字符串按照指定的码表写入文件中。
	 * 
	 * 分析：
	 *		因需要指定码表，故不能使用内部默认使用本地码表的FileWriter.
	 *		使用转换流
	 *
	 *
	 *下列情况用到转换流：
	 *
	 *1.源或目的对应的设备是字节流，但操作的却是文本数据，可以用转换作为桥梁。
	 *
	 *2.操作文本涉及到指定的编码表时，必须要用转换流
	 *
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		
		
		String setcharName = "utf-8"; //设置码表
//		String setcharName = "GBK"; //设置码表 gbk一个中文2个字节
//		new OutputStreamWriter(new FileOutputStream(""),charsetName)
//		
//		BufferedWriter buf = new BufferedWriter();
		
		BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("k:\\GBK.txt"),setcharName));
		
		buf.write("你好");
		
		buf.flush();
		
		buf.close();
		
		
		
	}

}
