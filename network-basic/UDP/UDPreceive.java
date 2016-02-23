package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPreceive
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		System.out.println("接收数据.......");
		/*
		 * 创建UDP传输接收端
		 * 思路：
		 * 1.建立socket接字端口！
		 * 2.创建包(接收用)
		 * 3.接收数据
		 * 4.解析包信息
		 * 5.关闭资源
		 */
//		1.建立socket接字端口！
		DatagramSocket ds = new DatagramSocket(20000); //端口号要与发送端设置的一致！
		
//		2.创建空数据包(接收用)
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length); //构造 DatagramPacket，用来接收长度为 length 的数据包。
		
//		 3.接收数据
		ds.receive(dp); //这个收到的是发送端的字节数组
		
//		4.解析包信息
		System.out.println(dp.getAddress().getHostAddress());
		System.out.println(dp.getPort());
		
		String data = new String(dp.getData(),0,dp.getLength());//将接收的数组信息拆箱为字符串
 		System.out.println(data);
		
// 		5.关闭资源
 		ds.close();
	}
}
