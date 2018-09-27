/*Copyright ©  2017 Lyons. All rights reserved. */
package ac.jobdu.TwoStar;

/**
 * @Description: 
             * 题目描述�?
        设a、b、c均是0�?9之间的数字，abc、bcc是两个三位数，且有：abc+bcc=532。求满足条件的所有a、b、c的�?��??
        输入�?
        题目没有任何输入�?
        输出�?
        请输出所有满足题目条件的a、b、c的�?��??
        a、b、c之间用空格隔�?�?
        每个输出占一行�??
        样例输入�?
        样例输出�?
 * @ClassName: Main1059
 * @author: lyons<zhanglei>
 * @date: 2017�?5�?23�? 下午11:25:05
 * @version: [1.0]
 */
public class Main1059
{
    public static void main(String[] args)
    {
        int a,b,c,temp;
        
        for (int i = 1; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                for (int j2 = 0; j2 < 10; j2++)
                {
                    a = i;
                    b = j;
                    c = j2;
                    temp = a*100 + b*110 + c*12;
                    if (temp == 532)
                    {
                        System.out.println(a+" "+b+" "+c);
                    }
                }
            }
        }
        
    }
    
}
