package sort.exchange;

/**

 */

/**
 * @Description: 交换-快速排序
 *
 *  基本思想：
 *  在待排序表中data[1...n]中任取一个元素privot作为基准，
 *  通过一趟排序将待排序表划分为独立的两部分L[1..k-1] 和 L[k+1...n],
 *  使得L[1...k-1]中所有元素小于等于privot，L[k+1...n]中所有元素大于等于privot，
 *  则privot放在其最终位置L(k)上，这个过程称为一趟快速排序。
 *  再分别递归地对两个子表重复上述过程，直至每部分内只有一个元素或空为止（所有元素已放在最终位置上）。
 *
 * @Auther: zhanglei(Lyons)
 * @Date: 2019/7/5 15:12
 */
public class QuickSort
{

    public static void sort(int[] data){
        sorting(data,0 , data.length-1);
    }

    /**
     * 快速排序算法
     * 
     * @param data 目标数组
     * @param start 起始位
     * @param end 结束位
     */
    private static void sorting(int[] data, int start, int end)
    {
        
        int i = start, j = end, key = data[start];//key代表选取的扫描比较词，同时data[start]成了一个坑
        
        while (j > i)
        {
            while (j > i && data[j] >= key) // = 1是为了跳出循环的，2是此时该坑不需要交换？
            {
                j--;
            }
            data[i] = data[j];//
            
            
            while (j > i && data[i] <= key)
            {
                i++;
            }
            data[j] = data[i];
        }
        data[i] = key;
        
        if (i - 1 > start)
        {
            // 递归调用，把key前面的完成排序
            sorting(data, start, i - 1);
        }
        if (i + 1 < end)
        {
            // 递归调用，把key后面的完成排序
            sorting(data, i + 1, end);
        }
        
    }
}
