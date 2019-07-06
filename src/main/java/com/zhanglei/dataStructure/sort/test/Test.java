/*Copyright ?  2019 Lyons. All rights reserved. */

package sort.test;


/**
 * @Description: sort≤‚ ‘¿‡
 * @Auther: zhanglei(Lyons)
 * @Date: 2019/7/5 15:15
 */
public class Test {

    public static final int N = 5; // ˝¡øº∂
    public static  int rangeR = 15;//ÀÊª˙ ˝◊÷ºØ
    public static String PACKET_NAME = "sort.";
    public static String PACKET = null;

    public static void main(String[] args)
    {
        int[] arr = null;

        /**
         * Ωªªª≈≈–Ú≤‚ ‘
         */

            PACKET = PACKET_NAME + "exchange.";
        /*    System.out.println("Ωªªª-√∞≈›≈≈–Ú≤‚ ‘");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"BubbleSort", arr);
            System.out.println("Ωªªª-øÏÀŸ≈≈–Ú≤‚ ‘");arr = null;
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"QuickSort", arr);*/

        /**
         * ≤Â»Î≈≈–Ú≤‚ ‘
         */
/*            PACKET = PACKET_NAME + "insert.";
            System.out.println("≤Â»Î-÷±Ω”≤Â»Î≈≈–Ú≤‚ ‘");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"StraightInsertionSort", arr);
            System.out.println("≤Â»Î-’€∞Î≤È’“≤Â»Î≈≈–Ú≤‚ ‘");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
//            arr = SortTestHelper.generateNearlyOrderedArray(N, 100);
            SortTestHelper.testSort(PACKET+"BinaryInsertionSort", arr);
            //TODO
/*            System.out.println("≤Â»Î-œ£∂˚≈≈–Ú≤‚ ‘");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"ShellInsert", arr);*/


        /**
         * —°‘Ò≈≈–Ú≤‚ ‘
         */

/*            PACKET = PACKET_NAME + "select.";
            System.out.println("—°‘Ò-ºÚµ•≈≈–Ú≤‚ ‘");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"SelectSort", arr);
            //TODO
            System.out.println("—°‘Ò-∂—≈≈–Ú≤‚ ‘");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"HeapSort", arr);*/

        /**
         * πÈ≤¢≈≈–Ú≈≈–Ú≤‚ ‘
         */
            PACKET = PACKET_NAME + "merge.";
            System.out.println("πÈ≤¢-∂˛¬∑πÈ≤¢≈≈–Ú≤‚ ‘");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"TwoWayMarge", arr);


    }


}
