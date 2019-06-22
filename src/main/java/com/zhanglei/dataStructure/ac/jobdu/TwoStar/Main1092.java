/*Copyright ©  2017 Lyons. All rights reserved. */
package ac.jobdu.TwoStar;

import java.util.Scanner;

/**
 * @Description: 
             * 题目描述�?
                The Fibonacci Numbers{0,1,1,2,3,5,8,13,21,34,55...} are defined by the recurrence: 
                F0=0 F1=1 Fn=Fn-1+Fn-2,n>=2 
                Write a program to calculate the Fibonacci Numbers.
            输入�?
                Each case contains a number n and you are expected to calculate Fn.(0<=n<=30) �?
            输出�?
               For each case, print a number Fn on a separate line,which means the nth Fibonacci Number.
            样例输入�?
            1
            样例输出�?
            1
 * @ClassName: Main1092
 * @author: lyons<zhanglei>
 * @date: 2017�?5�?27�? 上午11:18:27
 * @version: [1.0]
 */
public class Main1092
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int n = sc.nextInt();
            if (0 <= n && n <= 30 )
            {
                System.out.println(fibonacciNumber(n));
            }
        }
        
    }
    
    
    public static int fibonacciNumber(int n)
    {
        int[] number = new int[n+1]; // Fn 是从 0�?始�??
        
        if (n == 0){
            return 0;
        }else if (n == 1) {
            return 1;
        }
        
        number[1]=1; //之所以不用赋�? number[0]=0; 是因为初始化时已经赋�?
        for (int i = 2; i <= n;i++)
        {
            number[i] = (number[i-1] + number[i-2]);
        }
        
        return number[n];
    }
    
}
