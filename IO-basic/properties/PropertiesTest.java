package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 集合property 结合流进行操作
 * @author lyons(zhanglei)
 * @date Feb 13, 2016
 */

public class PropertiesTest
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
// 		propertyDemo1();
// 		writeToTxt();//将键值对储存到文件中
 		readByTxt();//取出键值对
 		
	}
	
	/**
	 * 取出键值对
	 * @throws IOException
	 */
	private static void readByTxt() throws IOException
	{
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("k:\\my.txt");
		
		prop.load(fis);
		
		prop.list(System.out);
	}

	/**
	 * property 基本功能
	 */
	private static void propertyDemo1()
	{
		Properties prop = new Properties();
		
		//存储元素
		prop.setProperty("shuxing","zhi");
		prop.setProperty("ok","12");
		
		//打印元素到控制台，调试用
		prop.list(System.out);
		
		//修改元素
		prop.setProperty("ok", "456");
		
		//取出元素
		System.out.println(prop.getProperty("shuxing"));
	}
	
	
	/**
	 * 将键值对存入文件中
	 * @throws FileNotFoundException 
	 */
	private static void writeToTxt() throws IOException
	{
		Properties prop = new Properties();
		
		prop.setProperty("name", "lyons");
		prop.setProperty("age", "11");
		
		FileOutputStream fos = new FileOutputStream("k:\\my.txt");
		
		prop.store(fos, "name+age");//第二个参数为描述信息
		
		fos.close();
	}
}
