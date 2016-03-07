package test01;


public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Queue queue = new Queue();
		
		queue.myAdd("a1");
		queue.myAdd("a2");
		queue.myAdd("a3");
		queue.myAdd("a4");
		
		System.out.println(queue.myGet());
		System.out.println(queue.myGet());
		System.out.println(queue.myGet());
		System.out.println(queue.myGet());
	}

}
