/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a9二进制中1or0的个数;


//思路：每次右移一位，判断是否是0即可。暂时没有找到别的好思路。
public class A9NumberOf0Solution {

    public static int NumberOf1Solution(int n){

        int count = 0;

        while (n != 0)
        {
            if ( (n&1) != 1) count++;

            n >>>= 1;

        }

        return count;
    }

}
