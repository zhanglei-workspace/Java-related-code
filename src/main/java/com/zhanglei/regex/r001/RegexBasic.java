package r001;


import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasic 
{

	/**
	 * 正则表达式基础知识
	 * @param args
	 */
	public static void main(String[] args)
	{
		ipSort();
		System.out.println("-----------------");
		
		
		int j = 0;
		for (int i = 0; i < 10; i++)
		{
			j=j++;
		}
		System.out.println(j);//结果为0；
		
		
		/* * 1.匹配
		 * 正则表达式
		 * 验证是否为qq号
		 * 长度为5-15，开头不为0
		 */
		 
		String qq = "595461241345352";
		
		String regex = "[1-9][0-9]{4,14}"; //第一位为1-9， 第二位为0-9。【0-9】出现4-14次
		
		boolean check = qq.matches(regex); //正则匹配返回结果为boolean类型
		System.out.println(qq+"       "+check);
		
		
		/* 
		 *  切割
		 */
		 
		String str = "zhangleittttwangfeimmmliudaren";
		
		String regex2 = "(.)\\1+"; // ()数组 .代表任意字符  1代表第一组   \\转义  +至少一次
									//上面的规则代表: 第一组的正则规则为任意字符出现至少一次
		
		String[] result = str.split(regex2); //切割的数组放到result中
		System.out.println("**********************");
		for (int i = 0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
		System.out.println("**********************");
		
		
		/*
		 *替换
		 *组的次序判断：数左括号就行
		 */
		String result3 = str.replaceAll("(.)\\1+","#"); //替换。str中出现次数连续大于1次的字符换成#
		System.out.println(result3);
		
		String result4 = str.replaceAll("(.)\\1+","$1"); //str中出现次数连续大于1次的字符换成 获取到的第一组字符 //$1获取第一组字符 
		System.out.println(result4);
		
//		上述打印结果如下：
//		zhanglei#wangfei#liudaren
//		zhangleitwangfeimliudaren
		
		//练习: 电话号码显示格式为158****1546
		String tel = "13689464561";
		String telNew = tel.replaceAll("(\\d{3})(\\d{4})(\\d{4})","$1****$3");//思路：将电话号码分成三组，获取每组的值进行替换
		System.out.println(telNew);
		
		
		/*
		 * 
		 * 获取
		 * 通过一个例子来学习获取
		 * 
		 * 将字符串  "da jia hao, wo shi yi ge xin shou xue yuan "  中三个字符相连的单词打印
		 */
		 
		System.out.println("-------------");
		String str4 = "da jia hao, wo shi yi ge xin shou xue yuan ";
		
		String regex4 = "\\b[a-z]{3}\\b"; // 代表单词边界\\b 
		 

		Pattern p = Pattern.compile(regex4); //封装
		Matcher m = p.matcher(str4);		//匹配
		
		while (m.find()) 
		{
			System.out.print(m.group()+"  "); //获取匹配的子序列
			System.out.println(m.start()+": "+m.end()); //在原字符串中该打印字符开始和结束的位置
			
		}
	}
	
	/**
	 * ip 排序
	 * 195.1.635.16 3.3.36.2 265.46.987.0 192.001.23.546
	 */
	public static void ipSort()
	{
		String ip_str = "195.1.635.16 3.3.36.2 265.46.987.0 192.1.23.546 192.1.22.546";
		System.out.println("原始\n"+ip_str);
		
		ip_str = ip_str.replaceAll("(\\d+)", "00$1");  //补零 如： 00195.001.00635.0016 003.003.0036.002
		ip_str = ip_str.replaceAll("0*(\\d{3})", "$1"); //每段保留三位数字
		String[] ips = ip_str.split(" +");              //切出ip地址
		
		TreeSet<String> sort = new TreeSet<String>(); //对象排序
		
		//添加ip到sort对象中（sort自动排序）
		for (String ip : ips) 
		{
			sort.add(ip);
		}
		//打印排序后的ip
		System.out.println("现在：");
		for (String ip : sort)
		{
			System.out.println(ip.replaceAll("0*(\\d+)", "$1")); //将补全0的字段还原
		}
		
	}
}
