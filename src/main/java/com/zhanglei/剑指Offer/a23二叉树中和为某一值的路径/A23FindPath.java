/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a23二叉树中和为某一值的路径;


import a0utiles.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class A23FindPath {

    public static int EXPECT_VALUE ; //要求的路径和
    
    /**
     * 输入一棵二叉树和一个整数， 打印出二叉树中结点值的和为输入整数的所有路径。
     * 从树的根结点开始往下一直到叶销点所经过的结点形成一条路径。
     *
     * @param root        树的根结点
     * @param EXPECT_VALUE 要求的路径和
     */
    public static void findPath(BinaryTreeNode root, int EXPECT_VALUE) {

        // 如果根结点不为空，就调用辅助处理方法
        if (root != null) {
            // 创建一个链表，用于存放根结点到当前处理结点的所经过的结点
            List<Integer> list = new ArrayList<>();
            A23FindPath.EXPECT_VALUE = EXPECT_VALUE;
            findPath(root, 0, list);
        }
    }

    /**
     * @param root        当前要处理的结点
     * @param curSum      当前记录的和（还未加上当前结点的值）
     * @param result      根结点到当前处理结点的所经过的结点，（还未包括当前结点）
     */
    private static void findPath(BinaryTreeNode root, int curSum, List<Integer> result) {

        // 如果结点不为空就进行处理
        if (root != null) {
            // 加上当前结点的值
            curSum += root.value;
            // 将当前结点入队
            result.add(root.value);
            // 如果当前结点的值小于期望的和
            if (curSum < EXPECT_VALUE) {
                // 递归处理左子树
                findPath(root.left, curSum, result);
                // 递归处理右子树
                findPath(root.right, curSum, result);
            }
            // 如果当前和与期望的和相等
            else if (curSum == EXPECT_VALUE && // 当前结点是叶结点，则输出结果
                    root.left == null && root.right == null) { //此时，必须为叶子节点
                    System.out.println(result);
            }
            // 当前已无左右子树，移除当前结点
            result.remove(result.size() - 1);
        }
    }
}
