package about;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A04
{
	/**
	 * "2015-4-25" "2016-2-05" 间隔多少天？
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException
	{
		// TODO Auto-generated method stub
		String str_1 = "2015-04-25";
		String str_2 = "2016-02-05";
		
		howManyDay(str_1,str_2);
		
	}

	public static void howManyDay(String str_1, String str_2) throws ParseException
	{
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		
		Date date1 = dateFormat.parse(str_1);
		Date date2 = dateFormat.parse(str_2);
		
		long time = Math.abs(date1.getTime() - date2.getTime());//时间间隔，毫秒值
		time = time/(1000*60*60*24);
		
		System.out.println("2015-4-25 2016-2-05 间隔 "+time+" 天");
		
	}
}
