package chatbyUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPreceive
{

	/**
	 * @param args
	 * @throws IOException 
	 * 如果是用dos窗口，那么 set classpath=   该包（即Chat）的bin目录下的绝对地址
	 * 
	 * java Chat.UDPsend
	 * 由包开始进入运行，如上
	 * 
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
		 * 3.解析包信息
		 * 4.关闭资源
		 */
		//1.建立socket接字端口！
		DatagramSocket ds = new DatagramSocket(20000);
		
		while(true)
		{
			//2.创建包(接收用)
			byte[] buf = new byte[1024]; //1024是随便指定的长度
			DatagramPacket dp = new DatagramPacket(buf,buf.length);
			
			// 3.接收数据
			ds.receive(dp); //这个收到的是发送端的字节数组
			
	//		3.解析包信息
	//		System.out.println(dp.getPort());
			
			String data = new String(dp.getData(),0,dp.getLength());//将接收的数组信息拆箱为字符串
				
	//			System.out.print(dp.getAddress().getHostAddress()+":");
				System.out.println(data);
				data = null;
		}
		
// 		ds.close();
	}

}
