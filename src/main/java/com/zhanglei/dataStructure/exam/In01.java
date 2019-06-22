/*Copyright ©  2018 Lyons. All rights reserved. */
package exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import netscape.javascript.JSObject;

/**
 * @Description: 
 *      题目：判断101-200之间有多少个素数，并输出所有素数。 
                程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，
                如果能被整除， 则表明此数不是素数，反之是素数。
 * @ClassName: In01
 * @author: lyons<zhanglei>
 * @date: 2018年1月9日 下午10:09:13
 * @version: [1.0]
 */
public class In01 
{
    public static boolean isAPrimeNumber(int num)
    {
        
        int tmp =num- 1;  
        for(int i= 2;i <=tmp; i++)  
          if(num %i== 0)  
             return false ;  
        return true ; 
    }
    
    public static int numberOfPrime(int number[])
    {
        int numberOfPrime = 0;
        for (int i : number)
        {
            if (isAPrimeNumber(i))
            {
                System.out.println(i);
                numberOfPrime++;
            }
        }
        return numberOfPrime;
    }
    
    public static void main(String[] args)
    {
        
        
        
        Pattern pattern = Pattern.compile("[e]");
        Matcher matcher = pattern.matcher("feaf");
        
        while (matcher.find())
        {
            System.out.println(matcher);
        }
        
        
        
//        int str[] = new int[99];
//        for (int i = 101,j=0; i < 200; )
//        {
//            str[j++] = i++;
//        }
////        
//        System.out.println(numberOfPrime(str));
//        
//            int count = 0;
//            for(int i=101; i<200; i+=2) {
//            boolean b = false;
//            for(int j=2; j<=Math.sqrt(i); j++) 
//            {
//            if(i % j == 0) { b = false; break; } 
//            else{ b = true; }
//            }
//            if(b == true) {count ++;System.out.println(i );}
//            }
//            System.out.println( "素数个数是: " + count);

        
    }
}
