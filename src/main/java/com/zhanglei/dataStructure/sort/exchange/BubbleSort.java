package sort.exchange;

/**
 * @Description: 交换-冒泡排序
 *
 * 比较相邻的元素。
 * 基本思想：假设待排序表长为n，从后往前（或从前往后）两两比较相邻元素的值，
 * 若违反我们的排序规则（即从小到大或从大到小），则交换它们，直到序列比较完。
 * 我们称为一趟冒泡，结果最大或者最小的元素交换到待排序列的第一个位置。
 * 下一趟第一个位置元素不再参与比较，待排序列减少一个，最多做n-1趟冒泡就能将所有元素排好序。
 *
 * @Auther: zhanglei(Lyons)
 * @Date: 2019/7/5 15:12
 */
public class BubbleSort
{
    /**
     * 冒泡排序算法
     * 
     * @param data 目标数组
     * @param length 结束位
     */
    public static void sorting(int[] data, int length)
    {
        boolean flag = true;
        for (int i = 0; i < length-1 && flag; i++)//次数
        {
            flag = false;
            for (int j = length-1; j > i; j--)
            {
                if (data[j] < data[j-1])
                {
                    data[j-1] = data[j-1] ^ data[j];
                    data[j] = data[j-1] ^ data[j];
                    data[j-1] = data[j-1] ^ data[j];

                    flag = true;
                }
            }
//            if (!flag) return;//本次未发生交换，那么说明所有次序列已经有序,此判断移动到for循环里面
        }

    }

    public static void sort(int[] data){
        sorting(data,data.length);
    }

}
