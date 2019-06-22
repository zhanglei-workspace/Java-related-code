/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/20 10:11
 */
package a9二进制中1or0的个数;

public class A93二进制高位连续0的个数 {


//    思路：每次与最高位为1的二进制进行&操作。
//      0x80000000的二进制是1000 0000 0000 0000 ...共32位，最高位为1.


    public static int NumberOf1Solution(int n){

        if (n == 0) return  32;

        int count = 0;
        int mask = 0x80000000;
        int j = n & mask;

        while (j == 0)
        {
            count++;
            n <<= 1;
            j = n & mask;
        }
        return count;
    }

}
