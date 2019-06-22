package randomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAF
{

	/**
	 * RandomAccessFile（随机读写文件）
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
//		writeFile();
		
		readFile();
	}

	public static void readFile() throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("K:\\11\\random.txt","r");
		
		//通过seek设置指针位置
//		raf.seek(1*2);//随机读取，只需指定指针的位置即可
		
		int age = raf.readInt();
		
		byte[] buf = new byte[20];
		raf.read(buf);
		
		String name = new String(buf);
		
		System.out.println("age:"+age);
		System.out.println("name:"+name);
		System.out.println("pos:"+raf.getFilePointer());
		

		raf.close();
	}

	public static void writeFile() throws IOException
	{
		//写入人员信息
		RandomAccessFile raf = new RandomAccessFile("K:\\11\\random.txt","rw");
		
		//指定存储位置
//		raf.seek(2);
		
		raf.write("中国".getBytes());
		raf.writeInt(7);
//		raf.write(187);
		
		raf.close();
	}

}
