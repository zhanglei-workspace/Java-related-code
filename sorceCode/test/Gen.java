/*Copyright ©  2018 Lyons. All rights reserved. */
package test;

;
/**
 * @Description: TODO
 * @ClassName: Gen
 * @author: lyons<zhanglei>
 * @date: 2018年2月28日 下午8:17:40
 * @version: [1.0]
 */
public class Gen<E>
{
       public static void main(String[] args)
    {
           
           Gen<String> aGen = new Gen<String>();
           
           
           System.out.println(aGen.toString());
           
           System.out.println(aGen.name());
           
    }
       
      public int name()
    {
       return 1;
    } 
      
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "chonxie";
    }
}
