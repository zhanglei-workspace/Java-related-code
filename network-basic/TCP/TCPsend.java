package TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPsend
{

	/**
	 * TCP发送端
	 * 必须先开服务端后开发送端
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		//建立socket服务
		Socket socket = new Socket("169.254.211.248",10001); //建立服务时就要确定，发送主机的ip地址、端口号
		
		//使用socket输出流
		OutputStream out = socket.getOutputStream();
		
		//写入数据
		out.write("大哥用TCP服务发送来了".getBytes()); //同样的，需要把信息转换成字节发送
		
		//关闭socke服务
		socket.close();		//无需再写关闭OutputStream out流，因为它是socket下的流。

	}

}
