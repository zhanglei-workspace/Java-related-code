package a008;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 统计投票结果
 * @author Lyons(zhanglei)
 *
 */
public class Fileutil
{
	/**
	 * 读取投票的结果
	 * @return
	 * @throws IOException
	 */
	public static String readFile() throws IOException
	{
		String str = "";
		
		File confile = new File("F://count.properties");
		
		//文件存在，则阅读
		if (confile.exists())
		{
			FileInputStream fis = new FileInputStream(confile);
			Properties prop = new Properties();
			prop.load(fis);
			
			String like = prop.getProperty("like");
			String dislike = prop.getProperty("dislike");
			String whatover = prop.getProperty("whatover");
			
			//将键值对放到字符串中
			if (like!=null)
			{
				int count = Integer.parseInt(like);
				str = "like"+"="+count+",";
			}
			if (dislike!=null)
			{
				int count = Integer.parseInt(dislike);
				str += "dislike"+"="+count+",";
			}
			if (whatover!=null)
			{
				int count = Integer.parseInt(whatover);
				str += "whatover"+"="+count+",";
			}
			
			fis.close();
			
			return str;
		}else 
			{
				return null;
			}
	
	}
	
	/**
	 * 写入文件
	 * @param key 投票者选取的值
	 * @throws IOException
	 */
	public static void writeFile(int key) throws IOException
	{
		File confile = new File("F://count.properties");
		if (!confile.exists())
		{
			confile.createNewFile();
		}
		
		FileInputStream fis = new FileInputStream(confile);
		Properties prop = new Properties();
		prop.load(fis);
		
		int count = 1;
		switch (key)
		{
		case 1:
					String like = prop.getProperty("like");
					if (like!=null)
					{
						count += Integer.parseInt(like);//原次数加1
					}else 
						{
							count = 1;
						}
					
					prop.setProperty("like", count+"");
					
			break;
		case 2:
					String dislike = prop.getProperty("dislike");
					
					if (dislike!=null)
					{
						count += Integer.parseInt(dislike);//原次数加1
					}else 
						{
							count = 1;
						}
					
					prop.setProperty("dislike", count+"");
				
			break;
		case 3:
					String whatover = prop.getProperty("whatover");
					
					if (whatover!=null)
					{
						count += Integer.parseInt(whatover);//原次数加1
					}else 
						{
							count = 1;
						}
					
					prop.setProperty("whatover", count+"");
			break;
		default:
			break;
		}
		
		FileOutputStream fos = new FileOutputStream(confile);
		prop.store(fos, null);
		fos.close();
		fis.close();
		
	}
	
}
