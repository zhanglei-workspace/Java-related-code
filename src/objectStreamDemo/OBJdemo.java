package objectStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OBJdemo
{

	/**
	 * 1.将Persion对象序列化，将堆中的对象储存到硬盘上
	 * 2.读取硬盘上的对象
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception
	{
//		writeObj();
		readObj();
	}

	/**
	 * 1.将Persion对象序列化，将堆中的对象储存到硬盘上
	 * @throws IOException
	 */
	private static void writeObj() throws IOException
	{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("K:\\11\\obj.Object")); //后缀为Object
		
		//对象序列化，被序列化的对象必须实现Serializable接口
		oos.writeObject(new Persion("lyons",24));
		
		oos.close();
	}

	/**
	 * 2.读取硬盘上的对象
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	private static void readObj() throws IOException, ClassNotFoundException
	{
		//ObjectInputStream只能读取ObjectOutputStream写入的对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("K:\\11\\obj.Object"));
		//对象的反序列化
		Persion p = (Persion)ois.readObject(); //因事先知道是Object对象内存储的是Persion对象，故用Persion类型，并做了强制转换
		
		//打印
		System.out.println(p.getName()+":"+p.getAge());
		
		ois.close();
	}
}
