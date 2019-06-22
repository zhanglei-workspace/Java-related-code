/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a13调整数组顺序使奇数位于偶数前面; //O（1）


public class A13Reorder {


    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有奇数位于数组的前半部分，所有偶数位予数组的后半部分。
     *
     * @param arr 输入的数组
     */
    public static int[] reorderOddEven(int[] arr) {

        int low = 0,high = arr.length-1;

       return quickSort(arr,low,high);
    }


    private static int[] quickSort(int[] arr, int low, int high) {

        int i = low,j = high;
        while (i < j){

            while (!((arr[j] & 1) == 1) && i < j){ //右边边搞偶数
                j--;
            }

            while (((arr[i] & 1) == 1) && i < j){//奇数： (arr[i] & 1) == 1 //左边搞奇数
                i++;
            }
            if (i < j){ //如果不判断会出现两个相同的数字交换
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
            j--;i++;

        }
        return  arr;
    }


}
