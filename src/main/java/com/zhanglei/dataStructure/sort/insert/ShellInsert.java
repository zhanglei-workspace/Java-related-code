/*Copyright ©  2019 Lyons. All rights reserved. */

package sort.insert;

/**
 * @Description: 插入-希尔排序
 *
 *  基本思想：
 *          先将待排序表分割成若干形如L[i, i+d, i+2d, ...i+kd]的特殊子表，分别进行直接插入排序，
 *          当整个表中元素已呈“基本有序”时，再对全体记录进行一次直接插入排序。
 *
 *          希尔排序的排序过程如下：
 *              先取一个小于n的步长d1， 把表中全部记录分成的d1个组，所有距离为d1的倍数的记录放在同一个组，
 *              在各组中进行直接插入排序，由于此时已经具有较好的局部有序性，故可以很快得到最终结果。
 *              尚未求得一个最好的增量序列，希尔提出的方法是d1=n/2, di+1= di/2，并且最后一个增量等于1。
 *
 * @Auther: zhanglei(Lyons)
 * @Date: 2019/7/6 09:29
 */
public class ShellInsert {
}
