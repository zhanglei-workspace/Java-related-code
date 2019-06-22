package test01;

import java.util.LinkedList;

public class Queue
{
	private LinkedList link;
	public Queue()
	{
		link = new LinkedList();
	}
	/*
	 * 队列的添加
	 */
	public void myAdd(Object object)
	{
		link.add(object);
	}
	
	public Object myGet()
	{
		return link.removeFirst();//返回并删除
	}
	
	public boolean isNull()
	{
		return link.isEmpty();
	}
}
