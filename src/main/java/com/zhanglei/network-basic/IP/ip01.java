package IP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ip01
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws UnknownHostException
	{
		InetAddress ip = InetAddress.getLocalHost();
		
//		System.out.println(ip);
//		ip =	InetAddress.getByName("www.sina.com");
		
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());
		
		
		
		
	}

}
