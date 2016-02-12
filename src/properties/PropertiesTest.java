package properties;

import java.util.Properties;

public class PropertiesTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Properties prop = new Properties();
		
		//存储元素
		prop.setProperty("shuxing","zhi");
		prop.setProperty("ok","12");
		
		//修改元素
		
		prop.setProperty("ok", "456");
		
		//取出元素
		
		System.out.println(prop.getProperty("shuxing"));
 		
	}
	
}
