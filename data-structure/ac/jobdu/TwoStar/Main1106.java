/*Copyright ©  2017 Lyons. All rights reserved. */
package ac.jobdu.TwoStar;

import java.util.Scanner;

/**
 * @Description: 
                         * 题目描述�?
                    对于给定的正整数 n，计算其十进制形式下�?有位置数字之和，并计算其平方的各位数字之和�??
                    输入�?
                    每行输入数据包括�?个正整数n(0<n<40000)，如果n=0 表示输入结束，并不用计算�?
                    输出�?
                    对于每个输入数据，计算其各位数字之和，以及其平方值的数字之和，输出在�?行中�?
                            之间用一个空格分隔，但行末不要有空格�?
                    样例输入�?
                    4
                    12
                    97
                    39999
                    0
                    样例输出�?
                    4 7
                    3 9
                    16 22
                    39 36
 * @ClassName: Main1106
 * @author: lyons<zhanglei>
 * @date: 2017�?5�?24�? 上午12:50:03
 * @version: [1.0]
 */
public class Main1106
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int number = scanner.nextInt();
            if (number == 0)
            {
                break;
            }else if (0<number && number<40000) {
                System.out.println(addNumByMath(number)+" "+addNumByMath(number*number));
            }
            
        }
        scanner.close();
        
    }
    
    /**
     * @Title: addNum
     * @Description: 方法�?：java解法
     * @param number
     * @return
     * @return: int
     */
    public static int addNum(int number)
    {
         int result = 0;
         String[] nums;
         String num;
         
         num = number+"";
         nums = num.split("");//注意分割的第0下标被占�?
         
         for (int i = 1; i < nums.length; i++) //注意是i=1�?�?
        {
           result +=  Integer.parseInt(nums[i]);
        }
       return result;
    }
    
    /**
     * @Title: addNumByMath
     * @Description: 方法二：数学解法
     * @param number
     * @return: int
     */
    public static int addNumByMath(int number)
    {
        int temp = 0;//临时储存空间
        
        /*
         * number % 10 = 该数的最后一个位置（上的数字�?
         * number / 10 = 去除该数的最后一位（上的数字�?
         */
        while (number > 0)
        {
            temp += number % 10;
            number /= 10;
        }
        return temp;
    }
}
