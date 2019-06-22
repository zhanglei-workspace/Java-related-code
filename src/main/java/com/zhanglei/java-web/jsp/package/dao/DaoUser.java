package dao;

import entity.User;

public class DaoUser
{
	/**
	 * 用户业务逻辑类
	 * 验证用户密码是否正确
	 * @return boolean
	 */
	public boolean DaoUSer(User user)
	{
		if ("lyons".equals(user.getUsername())&&"hello".equals(user.getPassword()))
		{
			return true;
		}else 
			{
				return false;
			}
	}
}
