/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a9二进制中1or0的个数;


public class A9NumberOf1Solution {

    public static int NumberOf1Solution3(int n){

        int count = 0;

        while (n != 0)
        {
            count++;
            n = n & (n - 1);
        }

        return count;
    }

}
