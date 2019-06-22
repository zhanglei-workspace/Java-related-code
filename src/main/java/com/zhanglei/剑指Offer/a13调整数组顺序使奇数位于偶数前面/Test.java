/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 19:10
 */
package a13调整数组顺序使奇数位于偶数前面;

public class Test {


    public static void main(String[] args) throws Exception {
        int[] array = {4,1233335,6,10,1,1233336};
        array =  A13Reorder.reorderOddEven(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int val: array) {
            System.out.println(val);
        }
    }


}
