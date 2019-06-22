/*Copyright ©  2017 Lyons. All rights reserved. */
package ac.jobdu.TwoStar;

/**
 * @Description: 
                       题目描述�?
                        设N是一个四位数，它�?9倍恰好是其反序数（例如：1234的反序数�?4321�?
                        求N的�??
                        输入�?
                        程序无任何输入数�?
                        输出�?
                        输出题目要求的四位数，如果结果有多组，则每组结果之间以回车隔�?
                        样例输入�?
                        样例输出�?
 * @ClassName: Main10
 * @author: lyons<zhanglei>
 * @date: 2017�?5�?21�? 下午7:28:45
 * @version: [1.0]
 */
public class Main1064
{
    public static void main(String[] args)
    {
        for (int i = 1000; i < 1111; i++)
        {
            if (i*9 == reverseInt2(i))
            {
                System.out.println(i);
            }
        }
    }

    /**
     * @Title: reverseStr
     * @Description: 方法�?：java解法-利用字符串反转解�?
     * @param num
     * @return: int
     */
    
    public static int reverseStr(int num)
    {
        String[] strs = (num+"").split("");
        StringBuffer temp = new StringBuffer();
        for (int i = strs.length - 1; i >= 0; i--)  //注意i取�?�范�?
        {
            temp.append(strs[i]);
        }
        return Integer.parseInt(temp.toString());
    }
    
    /**
     * @Title: reverseInt2
     * @Description:  方法二：数学解法-利用模除解答 (该�?�度快于reverseStr())
     * @param number
     * @return: int
     */
    public static int reverseInt2(int number)
    {
        /*
         * number % 10 = 该数的最后一个位置（上的数字�?
         * number / 10 = 去除该数的最后一位（上的数字�?
         * 
         * Tip:针对此题可以直接让i=1000
         */
        
        int result = 0, i = 0; //i: 数字的位�?
        int temp = number;
        
        /**
         * 获取该数字有多少�?
         *  java也可�?: String.valueOf(number).length()
         */
        while (temp != 0)
        {
            temp /= 10;
            i++;
        }
        
        while (number != 0)
        {
            result += (number%10) * (int)Math.pow(10, --i);//--i 因为要从10�?0次方�?�?
            
            number /= 10;
        }
        
        return result;
    }
    
}
