/*Copyright ©  2017 Lyons. All rights reserved. */
package ac.jobdu.TwoStar;

import java.util.Scanner;

/**
 * @Description: 
               * 题目描述?
                    编写程序，读入一个整数N?
                    若N为非负数，则计算N?2N之间的整数和?
                    若N为一个负数，则求2N到N之间的整数和
                    输入?
                    ?个整数N,N的绝对?小于等?1000
                    输出?
                    测试数据可能有多组，对于每一组数据，
                    输出题目要求的??
                    样例输入?
                    1
                    -1
                    样例输出?
                    3
                    -3
 * @ClassName: Main1002
 * @author: lyons<zhanglei>
 * @date: 2017?5?21? 下午6:25:51
 * @version: [1.0]
 */
public class Main1063
{
    public static void main(String[] args)
    {
          Scanner scanner = new Scanner(System.in);
         
          while (scanner.hasNext())
        {
              int N = scanner.nextInt();
              if (!(N >= -1000 && N <= 1000)) break; //注意是直接???
              
              int count = 0;
              
              if (N >= 0)
              {
                  for (int i = N; i <= 2*N; i++)
                {
                      count += i;
                }
                  
              }else {
                  for (int i = 2*N; i <= N; i++)
                  {
                      count += i;
                  }
              }
              
              System.out.println(count);
        }
          scanner.close();

    }
    
    
}
