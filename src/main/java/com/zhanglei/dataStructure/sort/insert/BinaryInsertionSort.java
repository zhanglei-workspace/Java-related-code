/*Copyright ©  2019 Lyons. All rights reserved. */

package sort.insert;

/**
 * @Description: 插入-折半插入排序
 *
 *      在直接插入排序的基础上，在有序序列查找最终位置的过程中使用折半查找，仅此而已
 *      故，折半查找排序仅仅是减少了比较元素的次数
 *
 *                性能测试发现【直接插入排序】虽然比【折半查找插入排序】比较次数多，但是用的总时间却少，
 *              个人认为：当数组总体趋于无序时,虽然数组数据比较少了，但指针比较次数增加了
 *
 * @Auther: zhanglei(Lyons)
 * @Date: 2019/7/6 08:00
 */
public class BinaryInsertionSort {
    public static void sort(int a[]){
        sorting(a,a.length);
    }

    private static void sorting(int data[], int length){

        int temp,i,low,high,mid,j;
        for (i = 1; i <= length-1; i++) {//依次将a[1]~a[n-1]插入到前面已排序的序列   注意： 不要忘记最后一个元素的插入比较

            temp = data[i];

            //折半查找
            low = 0;
            high = i-1;
            while (high >= low){    //必须有等于号。有序数列大小为1时，没有等于号就不会比较了
                mid = (high + low)/2;

                if (data[mid] > temp){
                    high = mid -1;
                }else {
                    low = mid+1;
                }
            }

            //移动
            for (j = i-1; j >= high+1; j--) {
                data[j+1] = data[j];
            }

            data[high+1] = temp;
        }
    }
}
