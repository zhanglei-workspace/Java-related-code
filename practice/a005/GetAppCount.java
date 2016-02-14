package a005;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GetAppCount
{

	/**
	 * 限制游客使用软件次数，超过次数提示注册后再使用
	 * 思路：
	 *  1.打开/创建 文件
	 *  2.修改次数（利用集合）
	 *  3.重新写入
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		GetAppcount();
	}
	
	/**
	 * 限制游客使用软件次数，超过次数提示注册后再使用
	 * @throws IOException
	 */
	private static void GetAppcount() throws IOException
	{
		File confile = new File("K:\\count.properties");
		if (!confile.exists())
		{
			confile.createNewFile();
		}
		FileInputStream fis = new FileInputStream(confile);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		//从集合中通过键获取次数
		String value = prop.getProperty("times");
		
		//定义计数器，获取登录次数
		int count = 0;
		if (value!=null)
		{
			count = Integer.parseInt(value);
			if (count>=5)
			{
				throw new RuntimeException("使用次数已到，注册后再使用");
			}
		}
		count++;
		
		//将改变后的次数重新储存到集合中
		prop.setProperty("times", count+"");
		FileOutputStream fos = new FileOutputStream(confile);
		prop.store(fos, "count-Test");
		
		fos.close();
		fis.close();
	}

}
