package objectStreamDemo;

import java.io.Serializable;


/**
 * Serializable：用于给被序列化的类加ID号
 * 作用：判断类和对象是否为同一版本
 * 
 */
public class Persion implements Serializable //必须实现此接口
{

	/**
	 * 序列号，可自定义数值
	 */
	private static final long serialVersionUID = 123456L;
	
//被关键字 transient 与 static 修饰的的字段不能被序列化到硬盘上
//	private transient String name;
//	private static int age;
	private String name;
	private int age;
	
	public Persion(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	//get、set
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}

}
