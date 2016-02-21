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
	 * 
	 */
	private static final long serialVersionUID = 123456L;
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
