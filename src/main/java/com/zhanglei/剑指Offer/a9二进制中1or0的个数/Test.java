/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 19:10
 */
package a9二进制中1or0的个数;

public class Test {


    public static void main(String[] args) throws Exception {

       int number =  A9NumberOf1Solution.NumberOf1Solution3(0xFFFFFFFF);
        System.out.println(number);

        System.out.println(Integer.bitCount(0xFFFFFFFF));


    }


}
