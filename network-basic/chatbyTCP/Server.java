package chatbyTCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{

	/**
	 * TCP 服务端
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		//1.建立serversocket服务
		ServerSocket ss = new ServerSocket(10008);
 		
		//2.获取连接过来的客户端对象
		Socket s = ss.accept();
		
		InetAddress ip = s.getInetAddress();//客户端ip
		
			
			//获取、解析信息
			BufferedReader bufin = new BufferedReader(new InputStreamReader(s.getInputStream()));
//			InputStream in = s.getInputStream(); //获取信息
//			
//			byte[] buf = new byte[1024];
//			int length = in.read(buf);
//			String receive = new String(buf,0,length);
			
			String line = null;
			while ((line=bufin.readLine())!=null)
			{
				
				
				
				if ("8686".equals(bufin))
				{
					System.out.println(ip+"...........退出聊天室");
//				//4.关闭流
					s.close();
					ss.close();
				}else 
					{
						System.out.println(ip+":"+line);
						//3.返回给发送端信息
						OutputStream out = s.getOutputStream();
						out.write("收到！".getBytes());
					}
			}
			
		

	}

}
