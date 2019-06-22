package entity;

/**
 * JavaBean 用户实体类
 * @author lyons(zhanglei)
 * @date Feb 26, 2016
 * @version 1.0
 */
public class User
{
	private String username; 
	private String password;
	
	public User(){}//公有无参构造函数

	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	
}
