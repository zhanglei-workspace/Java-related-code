/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a21从上到下打印二叉树;


import a0utiles.BinaryTreeNode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class A21PrintFromTopToBottom {


    /**
     * 从上往下打印出二叉树的每个结点，向一层的结点按照从左往右的顺序打印。
     * 例如下的二叉树，
     *       8
     *    /    \
     *   6     10
     *  /  \   / \
     * 5   7  9  11
     * 则依次打印出8、6、10、5、3 、9、11.
     *
     * @param root 树的结点
     */
    public static void printFromToBottom(BinaryTreeNode root) {

        Queue queue = new LinkedBlockingQueue();

        while (root != null){
            System.out.print(" "+root.value);
            if (root.left != null){
                queue.add(root.left);
            }
            if (root.right != null){
                queue.add(root.right);
            }

            root = (BinaryTreeNode) queue.poll();

        }


    }


}
