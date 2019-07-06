/*Copyright ©  2019 Lyons. All rights reserved. */

package sort.select;

/**
 * @Description: 选择-简单选择排序
 *
 * 基本思想：
 *           每一趟在后面n-i+1(i=1,2, ..., n-1)个待排序元素中选取关键字最小的元素，
 *          作为有序子序列的第 i 个元素，直到第 n-1 趟做完，待排序元素只剩下 1 个，就不用选了。
 *
 * @Auther: zhanglei(Lyons)
 * @Date: 2019/7/6 09:50
 */
public class SelectSort {

    public static void sort(int data[]){
        sorting(data,data.length);
    }

    private static void sorting(int[] data, int length) {
        for (int i = 0; i < length-1; i++) { // 剩下最后一个元素不用排序

            int min = i;
            for (int j = i+1; j < length; j++) {
                if (data[min] > data[j]){
                    min = j;
                }
            }

            if (min != i){
                int temp = data[i];
                data[i] = data[min];
                data[min] = temp;
            }

//            if (min != i){ //木弄明白原因，为什么下面这个方法没有这个判断可能会排序失败
//                data[min] = data[min] ^ data[i];
//                data[i] = data[min] ^ data[i];
//                data[min] = data[min] ^ data[i];
//            }

        }
    }
}
