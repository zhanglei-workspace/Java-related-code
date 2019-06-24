/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 19:10
 */
package a17树的子结构; //a12在O(1)时间删除链表结点


import a0utiles.BinaryTreeNode;

import static a17树的子结构.A17HasSubtree.hasSubtree;

public class Test {


    public static void main(String[] args) throws Exception {
        BinaryTreeNode root1 = new BinaryTreeNode();
        root1.value = 8;
        root1.right = new BinaryTreeNode();
        root1.right.value = 7;
        root1.left = new BinaryTreeNode();
        root1.left.value = 8;
        root1.left.left = new BinaryTreeNode();
        root1.left.left.value = 9;
        root1.left.right = new BinaryTreeNode();
        root1.left.right.value = 2;
        root1.left.right.left = new BinaryTreeNode();
        root1.left.right.left.left = new BinaryTreeNode();
        root1.left.right.left.left.value = 4;
        root1.left.right.left.right = new BinaryTreeNode();
        root1.left.right.left.right.value = 7;

        BinaryTreeNode root2 = new BinaryTreeNode();
        root2.value = 8;
        root2.left = new BinaryTreeNode();
        root2.left.value = 9;
        root2.right = new BinaryTreeNode();
        root2.right.value = 2;

        System.out.println(hasSubtree(root1, root2));
        System.out.println(hasSubtree(root2, root1));
        System.out.println(hasSubtree(root1, root1.left));
        System.out.println(hasSubtree(root1, null));
        System.out.println(hasSubtree(null, root2));
        System.out.println(hasSubtree(null, null));
    }


}
