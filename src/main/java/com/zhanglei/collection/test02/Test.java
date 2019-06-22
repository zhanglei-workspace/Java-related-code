package test02;

import java.util.ArrayList;

public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ArrayList<Persion> al = new ArrayList<Persion>();
		
		al.add(new Persion("lisi",20));
		al.add(new Persion("lisan",21));
		al.add(new Persion("lier",22));
		al.add(new Persion("liwu",25));
		
		System.out.println(al);
	}

}
