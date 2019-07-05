/*Copyright ?  2019 Lyons. All rights reserved. */

package sort.test;


/**
 * @Description: sort≤‚ ‘¿‡
 * @Auther: zhanglei(Lyons)
 * @Date: 2019/7/5 15:15
 */
public class Test {

    public static final int N = 10000;
    public static  int rangeR = 100000;
    public static String PACKET_NAME = "sort.";
    public static String PACKET = null;

    public static void main(String[] args)
    {
        int[] arr = null;

        /**
         * Ωªªª≤‚ ‘
         */

            PACKET = PACKET_NAME + "exchange.";
            System.out.println("Ωªªª-√∞≈›≈≈–Ú≤‚ ‘");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"BubbleSort", arr);
            System.out.println("Ωªªª-øÏÀŸ≈≈–Ú≤‚ ‘");arr = null;
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"QuickSort", arr);

        /**
         * ≤Â»Î≤‚ ‘
         */
            PACKET = PACKET_NAME + "insert.";
            System.out.println("≤Â»Î-÷±Ω”≤Â»Î≈≈–Ú≤‚ ‘");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"StraightInsertionSort", arr);


    }


}
