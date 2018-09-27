/*Copyright ©  2017 Lyons. All rights reserved. */
package ac.jobdu.TwoStar;

import java.util.Scanner;

/**
 * @Description: 
            题目描述�?
            写个算法，对2个小�?1000000000的输入，求结果�??
            特殊乘法举例�?123 * 45 = 1*4 +1*5 +2*4 +2*5 +3*4+3*5
            输入�?
             两个小于1000000000的数
            输出�?
             输入可能有多组数据，对于每一组数据，输出Input中的
                     两个数按照题目要求的方法进行运算后得到的结果�?
            样例输入�?
            123 45
            样例输出�?
            54

 * @ClassName: Main1083
 * @author: lyons<zhanglei>
 * @date: 2017�?5�?26�? 上午1:25:51
 * @version: [1.0]
 */
public class Main1083
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int  a = scanner.nextInt(),
                 b = scanner.nextInt();
            
            System.out.println(getNumberArray(a, b));
            
           /* int[] as = getNumberArray(a),
                  bs = getNumberArray(b);
            
            int temp = 0;
            
            for (int i = 0; i < as.length; i++)
            {
                for (int j = 0; j < bs.length; j++)
                {
                    temp += as[i]*bs[j];
                }
            }
            System.out.println(temp);*/
        }
        scanner.close();
    }
    
    /**
     * @Title: getNumberArray
     * @Description: 方法�?：数字分割到int数组�?
     * @param number
     * @return: int[]
     */
    public static int[] getNumberArray(int number)
    {
        String[] nums =  (number+"").split("");
        
        int[] numbers = new int[nums.length-1];
        
        for (int i = 1,j=0; i < nums.length; i++)
        {
            numbers[j++] = Integer.parseInt(nums[i]);
        }
        
        return numbers;
    }
    
    /**
     * @Title: getNumberArray
     * @Description: 方法二：数学运算实现
     * @param a
     * @param b
     * @return
     * @return: int
     */
    public static int getNumberArray(int a,int b)
    {
        int tempa=0, addNum=0;
        final int tempb = b;

        while (a != 0)
        {
            tempa = a % 10;
            while (b != 0)
            {
                addNum += (b%10)*tempa;
                b /= 10;
            }
            a /= 10;
            b = tempb;//还原b到原来的数�??
        }
        return addNum;
    }
    
}
