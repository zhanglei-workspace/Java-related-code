/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 19:10
 */
package a5重建二叉树_;

public class Test {


    public static void main(String[] args) throws Exception {
        int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
        my.BinaryTree root = my.construct(preorder,inorder);
        printTree(root);

    }
    // 中序遍历二叉树,打印
    public static void printTree(my.BinaryTree root) {
            if (root != null) {
                printTree(root.leftNode);
                System.out.print(root.value + " ");
                printTree(root.rightNode);
            }

    }
}
