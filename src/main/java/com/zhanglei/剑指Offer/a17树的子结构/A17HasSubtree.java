package a17树的子结构; //O（1）


public class A17HasSubtree {

    /**
     * 二叉树节点类
     */
    public static class BinaryTreeNode {
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    /**
     * 输入两棵二叉树A和B，判断B是不是A的子结构。
     * 该方法是在A树中找到一个与B树的根节点相等的元素的结点，
     * 从这个相等的结点开始判断树B是不是树A的子结构，如果找到其的一个就返回，
     * 否则直到所有的结点都找完为止。
     *
     * @param root1 树A的根结点
     * @param root2 树B的根结点
     * @return true：树B是树A的子结构，false：树B是不树A的子结构
     */
    public static boolean hasSubtree(BinaryTreeNode root1, BinaryTreeNode root2) {

        Boolean result = false;

        if (root1 != null && root2 != null){

            if (root1.value == root2.value){
                result = match(root1,root2 );
            }
            if (!result){
                result = match(root1.left,root2 );
            }
            if (!result){
                result = match(root1.right,root2 );
            }
        }

        return  result;

    }

    public static boolean match(BinaryTreeNode root1, BinaryTreeNode root2) {

        if (root2 == null)return true;
        if (root1 == null) return false;
        if (root1.value != root2.value) return  false;

        return match(root1.left,root2.left) && match(root1.right,root2.right );
    }

}
