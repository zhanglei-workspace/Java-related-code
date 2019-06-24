/*Copyright ©  2019 Lyons. All rights reserved. */

package a22二叉搜索树的后序遍历序列;

/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
public class A22VerifySquenceOfBST {


    public static boolean verifySequenceOfBST(int[] sequence) {
        if (sequence == null) return  false;
        int length = sequence.length;
        return  core(sequence,0, length-1);
    }


    //           10
    //         /   \
    //        6     14
    //       /\     /\
    //      4  8  12  16
//    int[] data = {4, 8, 6, 12, 16, 14, 10};
//    false: {7, 4, 6, 5};
    public static boolean core(int[] sequence,int start, int end)
    {
        if (start >= end) return true; //仅剩下一个节点或者没有节点了，ok

        int i = start;
        int j = end -1;
//        从左向右找第一个大于sequence[end]的索引
        while (sequence[i] < sequence[end] && i < j){
            i++;
        }
        //从右向左找最后一个大于sequence[end]的索引
        while (sequence[j] > sequence[end] && j > i){
            j--;
        }

        //不重合就不符合条件
        if (i != j ) return false;

        //验证所有节点
        return core(sequence, start, i-1) && core(sequence, i, end-1);

    }

}
