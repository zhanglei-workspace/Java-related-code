/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a18二叉树的镜像; //O（1）


public class A18SubtreeMirror {

    /**
     * 二叉树节点类
     */
    public static class BinaryTreeNode {
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    /**
     * 请完成一个函数，输入…个二叉树，该函数输出它的镜像
     *
     * @param node 二叉树的根结点
     */
    public static void mirror(BinaryTreeNode node) {

        if (node != null){

            BinaryTreeNode temp = node.right;
            node.right = node.left;
            node.left = temp;

            mirror(node.left);
            mirror(node.right);
        }

    }



}
