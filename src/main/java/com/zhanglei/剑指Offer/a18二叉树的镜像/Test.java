/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 19:10
 */
package a18二叉树的镜像; //a12在O(1)时间删除链表结点


import static a18二叉树的镜像.A18SubtreeMirror.mirror;

public class Test {


    public static void main(String[] args) throws Exception {
        //       8
        //    /    \
        //   6     10
        //  / \   / \
        // 5   7 9  11
        A18SubtreeMirror.BinaryTreeNode root = new A18SubtreeMirror.BinaryTreeNode();
        root.value = 8;
        root.left = new A18SubtreeMirror.BinaryTreeNode();
        root.left.value = 6;
        root.left.left = new A18SubtreeMirror.BinaryTreeNode();
        root.left.left.value = 5;
        root.left.right = new A18SubtreeMirror.BinaryTreeNode();
        root.left.right.value = 7;
        root.right = new A18SubtreeMirror.BinaryTreeNode();
        root.right.value = 10;
        root.right.left = new A18SubtreeMirror.BinaryTreeNode();
        root.right.left.value = 9;
        root.right.right = new A18SubtreeMirror.BinaryTreeNode();
        root.right.right.value = 11;
        printTree(root);
        System.out.println();
        mirror(root);
        printTree(root);
        //         1
        //        /
        //       3
        //      /
        //     5
        //    /
        //   7
        //  /
        // 9
        A18SubtreeMirror.BinaryTreeNode root2 = new A18SubtreeMirror.BinaryTreeNode();
        root2.value = 1;
        root2.left = new A18SubtreeMirror.BinaryTreeNode();
        root2.left.value = 3;
        root2.left.left = new A18SubtreeMirror.BinaryTreeNode();
        root2.left.left.value = 5;
        root2.left.left.left = new A18SubtreeMirror.BinaryTreeNode();
        root2.left.left.left.value = 7;
        root2.left.left.left.left = new A18SubtreeMirror.BinaryTreeNode();
        root2.left.left.left.left.value = 9;
        System.out.println("\n");
        printTree(root2);
        System.out.println();
        mirror(root2);
        printTree(root2);

        // 0
        //  \
        //   2
        //    \
        //     4
        //      \
        //       6
        //        \
        //         8
        A18SubtreeMirror.BinaryTreeNode root3 = new A18SubtreeMirror.BinaryTreeNode();
        root3.value = 0;
        root3.right = new A18SubtreeMirror.BinaryTreeNode();
        root3.right.value = 2;
        root3.right.right = new A18SubtreeMirror.BinaryTreeNode();
        root3.right.right.value = 4;
        root3.right.right.right = new A18SubtreeMirror.BinaryTreeNode();
        root3.right.right.right.value = 6;
        root3.right.right.right.right = new A18SubtreeMirror.BinaryTreeNode();
        root3.right.right.right.right.value = 8;
        System.out.println("\n");
        printTree(root3);
        System.out.println();
        mirror(root3);
        printTree(root3);


    }


    public static void printTree(A18SubtreeMirror.BinaryTreeNode node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.value + " ");
            printTree(node.right);
        }
    }
}
