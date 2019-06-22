package r001;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler
{

	/**
	 * getqqs() 获取qq群中所有成员的邮箱 (已从网页中获取HTML资源 放到本地  K:\Crawler.txt)
	 * 
	 * getByWeb(); 网络获取qq群中所有成员的邮箱
	 */
	public static void main(String[] args) throws IOException
	{
		int count = 0;
		//爬取本地文件
		List<String> qqs = getqqs();
		
		for (String qq : qqs)
		{
			System.out.print(qq.replaceAll("[(]([\\d]+)[)]", "$1@qq.com;")+"\t");
			count+=1;
			if (count%8 == 0)
			{
				System.out.println();
			}
		}
		System.out.println();
		System.err.println("----------");
		System.out.println("本次爬取qq群中有效qq邮箱总数："+count+"个");
		
		/**
		 * 爬取网络文件
		 */
		/*int count = 0;
		List<String> sources = getByWeb();
		
		for (String source : sources)
		{
			System.out.print(source.replaceAll("[(]([\\d]+)[)]", "$1@qq.com;")+"\t");
			count+=1;
			if (count%5 == 0)
			{
				System.out.println();
			}
			
		}
		System.out.println(count);*/
	}
	
	/*
	 * 本地爬取qq号！
	 */
	
	public static List<String> getqqs() throws IOException
	{
		
		List<String> list = new ArrayList<String>();
		
//		1.打开本地源文件
		BufferedReader source = new BufferedReader(new FileReader("K:\\Crawler.html"));
//		2.数据匹配
		String regex = "[(]\\d+[)]";
		Pattern p = Pattern.compile(regex);
		
		String line = null;
		while ( (line=source.readLine())!=null ) //打开的源文件数据每行有信息就进行匹配
		{
			Matcher m = p.matcher(line);
			while (m.find())
			{
				//讲规则的数据都存储到集合中
				list.add(m.group());
			}
		}
		return list;
	}
	
	/**
	 * 爬取网页qq号
	 * 
	 */
	private static List<String> getByWeb() throws IOException
	{
	List<String> list = new ArrayList<String>();
		
//		1.打开web源文件
		
		URL url = new URL("http://localhost:8080/SuperMembershipGMS/Crawler2.html"); //url为qq群空间查看群成员地址。qq版本2016/1/24
		BufferedReader source = new BufferedReader(new InputStreamReader(url.openStream()));

//		2.数据匹配
		String regex = "[(]\\d+[)]";
		Pattern p = Pattern.compile(regex);
		
		String line = null;
		while ( (line=source.readLine())!=null ) //打开的源文件数据每行有信息就进行匹配
		{
			Matcher m = p.matcher(line);
			while (m.find())
			{
				//讲规则的数据都存储到集合中
				list.add(m.group());
			}
		}
		return list;
	}
}
