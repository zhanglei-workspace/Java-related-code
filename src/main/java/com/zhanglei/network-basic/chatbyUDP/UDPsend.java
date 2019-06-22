package chatbyUDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPsend
{
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		System.out.println("发送数据........");
		/*
		 * 创建UDP传输的发送端
		 * 思路：
		 * 1.建立UDP的socket服务
		 * 2.将发送的数据封装到数据包中
		 * 3.通过UDP的socket服务发送
		 * 4.关闭socket资源
		 */
		
		//1.使用DatagramSocket对象 创建UDP的socket服务
		DatagramSocket ds = new DatagramSocket();
		
		//2.将发送的数据封装到数据包中
		while (true)
		{
			BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));//从控制台读取信息
			
			String line = null;
			while ((line=bufRead.readLine()) != null)
			{
				
				
				//使用DatagramPacket 将数据封装到该对象包中
				byte[] buf = line.getBytes();
				
				DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.31.190"),20000);
				//      包的长度							发送到目的主机 	目标主机端口号 
				
				//3.使用UDP的socket服务的send方法
				ds.send(dp);
				
				//4.关闭socket服务
				if ("exit".equals(line))
				{
					ds.close();
					break;
				}
			}
		}
	}

}
