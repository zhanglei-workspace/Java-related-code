package chatbyUDP;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Chat
{

	/**
	 * 多线程实现同一个窗口聊天！
	 * @param args
	 * ip第第四段： 0不能用，255为广播
	 * @throws SocketException 
	 */
	public static void main(String[] args) throws SocketException
	{
		DatagramSocket send    = new DatagramSocket();
		DatagramSocket receive = new DatagramSocket(20002);
		
		new Thread(new Send(send)).start(); 		//开启发送线程
		new Thread(new Receive(receive)).start();	//开启接收线程
		

	}

}
