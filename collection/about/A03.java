package about;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间与日期
 * @author abc
 *
 */
public class A03
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Date date = new Date();
		System.out.println("Test1------   "+date);
		
		DateFormat dateFormat2 = DateFormat.getDateInstance();
		String date2 = dateFormat2.format(date);
		System.out.println("Test2------   "+date2);
		
		DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL);
		String date3 = dateFormat3.format(date);
		System.out.println("Test2------   "+date3);
		
		DateFormat dateFormat4 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		String date4 = dateFormat4.format(date);
		System.out.println("Test2------   "+date4);
		
		//自定义格式
		dateFormat5 = new SimpleDateFormat("YYYY/MM/dd");
		String date5 = dateFormat5.format(date);
		System.out.println("Test2------   "+date5);
	}

}
