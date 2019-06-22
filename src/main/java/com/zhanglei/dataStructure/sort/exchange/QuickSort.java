package sort.exchange;

public class QuickSort
{
    /**
     * 快速排序算法
     * 
     * @param data 目标数组
     * @param start 起始位
     * @param end 结束位
     */
    public static void quickSort(int[] data, int start, int end)
    {
        
        int i = start, j = end, key = data[start];//key代表选取的扫描比较词
        
        while (j > i)
        {
            while (j > i && data[j] > key)
            {
                j--;
            }
            data[i] = data[j];
            
            
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
            quickSort(data, start, i - 1);
        }
        if (i + 1 < end)
        {
            // 递归调用，把key后面的完成排序
            quickSort(data, i + 1, end);
        }
        
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
//        System.out.println("34, 21, 54, 18, 23, 76, 41, 38, 98, 45, 495, 33, 27, 51, 11, 20, 79, 30, 89, 41, 41");
//        int[] p = {34, 21, 54, 18, 23, 76, 41, 38, 98, 45, 495, 33, 27, 51, 11, 20, 79, 30, 89, 41, 41};
        System.out.println("8,5,10,9");
        int p[] = {8,5,10,9};
        
        QuickSort.quickSort(p, 0, p.length - 1);// 快速排序
        
        for (int i = 0; i < p.length; i++)
        {
            System.out.print(p[i] + ",");
        }
    }
}
