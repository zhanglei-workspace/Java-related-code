package chatbyUDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Send implements Runnable
{
	private DatagramSocket ds;
	public Send(DatagramSocket ds)
	{
		this.ds = ds;
	}
	
	public void run()
	{
		try
		{
			System.out.print("send:");
			//2.将发送的数据封装到数据包中
			while (true)
			{
				BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));//从控制台读取信息
				
				String line = null;
				while((line=bufRead.readLine()) != null)
				{
					//使用DatagramPacket 将数据封装到该对象包中
					byte[] buf = line.getBytes();
					
					DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.31.190"),20002);
					//      包的长度							发送到目的主机 	目标主机端口号 
					
					//3.使用UDP的socket服务的send方法
					ds.send(dp);
					
					//4.关闭socket服务
					if ("8686".equals(line))
					{
						System.out.println("send serve is closed");
						ds.close(); //4.关闭socket服务
						break;
					}
				}
			 break;
			}
		} catch (UnknownHostException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
