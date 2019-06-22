package chatbyTCP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client
{

	/**
	 * TCP客户端
	 * 必须先开服务端后开客户端
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		//建立socket服务
		Socket socket = new Socket("192.168.31.190",10008); //建立服务时就要确定，发送主机的ip地址、端口号
		
		while (true)
		{
			
			//使用socket输出流
			OutputStream out = socket.getOutputStream();
			
			//写入数据
			BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			
			while ((line=bufRead.readLine())!=null)
			{
				out.write(line.getBytes());
//			out.write("大哥用TCP服务发送来了".getBytes()); //同样的，需要把信息转换成字节发送
				
				if ("8686".equals(line))
				{
					
					//关闭socke服务
					socket.close();		//无需再写关闭OutputStream out流，因为它是socket下的流。
					break;
				}
				
				//读取服务端数据
//				InputStream in = socket.getInputStream();
//				byte[] buf = new byte[1024];
//				int length = in.read(buf);
//				
//				String text = new String(buf,0,length);
//				System.out.println(text);
			}
			break;
		}
	}

}
