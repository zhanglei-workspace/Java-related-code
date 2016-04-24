package about;

import java.util.Calendar;

public class A05
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR); 
		int month = c.get(Calendar.MONTH+1);//月份从0开始计
		int day = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.WEEK_OF_MONTH);
		
		System.out.println(year+"年"+month+"月"+day+"日 \n"+getWeek(week));
		
		Calendar c2 = Calendar.getInstance();
		c2.add(Calendar.YEAR, 2);//时间偏移
		
		int year2 = c2.get(Calendar.YEAR);
		
		System.out.println("时间偏移后：      "+year2+"年");
		
		
		//显示每年的二月有多少天
		int FindYear = 2013;
		int Firdays = showFirDay(FindYear);
		System.out.println(FindYear+"年的二月有"+Firdays+"天");

	}
	
	/**
	 * 计算每年的二月有多少天
	 * 思路：设置参数传递年份为3月1日，然后再减掉一天，即为所求
	 * @param year
	 * @return int
	 */
	public static int showFirDay(int year)
	{
		Calendar c = Calendar.getInstance();
		
		c.set(year, 2 ,1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		return c.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 将美式日期日期转换为中文格式
	 * @param week
	 * @return
	 */
	public static String getWeek(int week)
	{
		String weeks[] = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		return weeks[week];
	}
}
