package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPreceive
{

	/**
	 * TCP 客户端
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		//1.建立serversocket服务
		ServerSocket ss = new ServerSocket(10001);
 		
		//2.获取连接过来的客户端对象
		Socket s = ss.accept();
		
		//获取、解析信息
			InputStream in = s.getInputStream(); //获取信息
			
			byte[] buf = new byte[1024];
			int length = in.read(buf);
			String text = new String(buf,0,length);
			
			System.out.println(text);
//			String buf = new String(new byte[1024],0,in.le);
		//3.关闭流
			s.close();
			ss.close();
	}

}
