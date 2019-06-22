package chatbyUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive implements Runnable
{
	
	private DatagramSocket ds;
	public Receive(DatagramSocket ds)
	{
		this.ds = ds;
	}

	public void run()
	{
			try
			{
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
						
					if ("8686".equals(data))
					{
						System.out.println(dp.getAddress().getHostAddress()+".......退出聊天室！");
					}else 
						{
							System.out.print("Receive:"+dp.getAddress().getHostAddress()+":");
							System.out.println(data);
						}
					
				}
			} catch (IOException e)
			{
				e.printStackTrace();
			}
	}

}
