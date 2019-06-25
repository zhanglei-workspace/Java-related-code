/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a25二叉搜索树与双向链表;


import a0utiles.BinaryTreeNode;
import a5重建二叉树_.my;

import java.util.ArrayList;
import java.util.List;

public class A25BinaryTreeDoubleLink {


    public static BinaryTreeNode convert(BinaryTreeNode root) {

        BinaryTreeNode[] linkLastNode = new BinaryTreeNode[1];
        intermediateTraversal(root,linkLastNode);

        // 找到双向链表的头结点
        BinaryTreeNode head = linkLastNode[0];
        while (head != null && head.left != null) {
            head = head.left;
        }
        return  head;

    }

    //            10
    //         /      \
    //        6        14
    //       /\        /\
    //      4  8      12 16
//                           [4->6-8,10,12,14,16]

    /**
     * @param node
     * @param linkLastNode “新”链表的最新插入的那一个节点,为什么要用数组，因为是地址传递，在递归中可以改变其值而可以被其他递归层面上的引用发现改变
     * @return
     */
    private static void intermediateTraversal(BinaryTreeNode node,BinaryTreeNode[] linkLastNode) {

        if (node != null){

            if (node.left != null){
                intermediateTraversal(node.left, linkLastNode);
            }

            node.left = linkLastNode[0]; //node作为Link的“新”插入节点

            if (linkLastNode[0] != null){
                linkLastNode[0].right = node;
            }

            linkLastNode[0] = node;   //当前树的节点作为link的新节点(缓存起来)，尾插法

            if (node.right != null){
                intermediateTraversal(node.right, linkLastNode);
            }
        }
    }

}
