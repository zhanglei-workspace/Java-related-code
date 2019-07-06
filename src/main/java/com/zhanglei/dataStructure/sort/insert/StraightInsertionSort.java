/*Copyright ©  2019 Lyons. All rights reserved. */

package sort.insert;

/**
 * @Description: 插入-直接插入排序
 *
 * 基本思想
 *      在于每次将一个待排序的记录，
 *      按其关键字大小插入到前面已经排好序的子序列中，直到全部记录插入完成。
 *
 *      有序序列 L[1..i-1] 无序序列L[i+1...n]
 *      序列： L[1..i-1] L(i) L[i+1...n]
 *
 *      代码步骤：
 *          1.从右往左查找比较L(i)在L[1..i-1]中的插入位置k
 *          2.在比较的过程中，若L[1..i-1]中的值若大于L(i)，则往后移位，
 *          3.当不大于时就是则比较指针位于L(i)的最终位置的左边那个位置，将L(i)的值放入最终位置
 *
 *
 *      结果步骤：
     *      1.查找出L(i)在L[1..i-1]中的插入位置k
     *      2.将L[k..i-1]中的所有元素全部后移一个为位置
     *      3.将L(i)复制到L(k)
 *
 * @Auther: zhanglei(Lyons)
 * @Date: 2019/7/5 15:12
 */
public class StraightInsertionSort {

    public static void sort(int a[]){
        sorting(a,a.length);
    }

    private static void sorting(int a[], int length){
        int temp,j,i;
        for (i = 1; i <= length-1; i++) {//依次将a[1]~a[n-1]插入到前面已排序的序列   注意： 不要忘记最后一个元素的插入比较

            temp = a[i];
            for (j = i-1; j >= 0 && temp < a[j] ; j--) {//遍历【有序】序列,从后往前查找待插入位置 注意： j >= 0要在前面，否则，会出现指针越界的情况
                a[j+1] = a[j]; //第一次的 a[j+1] 就是L(i)这个位置
            }
            a[j+1] = temp;//此时由于上面这个循环 j-- 跳出循环条件时，定在了k-1这个位置
        }
    }

}
