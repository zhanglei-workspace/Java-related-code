/*Copyright ©  2019 Lyons. All rights reserved. */

package sort.merge;

import java.util.Arrays;

/**
 * @Description: 归并-二路归并排序
 *
 *       “归并”的含义是将一个或两个以上的有序表组合成一个新的有序表。
 *       假定待排序表含有n个记录，则可以视为n个有序的子表，每个子表长度为1，然后两两归并，
 *       得到n/2个长度为2或1的有序表；再两两归并，......
 *       如此重复，直到合并成一个长度为n的有序表为止，这种排序方法称为二路归并排序。
 *
 *       https://blog.csdn.net/jianyuerensheng/article/details/51262984
 *
 * @Auther: zhanglei(Lyons)
 * @Date: 2019/7/6 14:37
 */
public class TwoWayMarge {

    public static void sort(int data[]){
        sorting(data,0,data.length-1);
    }

    private static void sorting(int[] data, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边
            sorting(data, low, mid);
            // 右边
            sorting(data, mid + 1, high);
            // 左右归并
            merge(data, low, mid, high);
        }
    }

    public static void merge(int[] data, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (data[i] < data[j]) {
                temp[k++] = data[i++];
            } else {
                temp[k++] = data[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = data[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = data[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            data[k2 + low] = temp[k2];
        }
    }
}

