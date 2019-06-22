/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a5重建二叉树_;


public class A51constructTree {

    /**
     * 二叉树节点类
     */
    public static class BinaryTreeNode {
        int nodeValue;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二节树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     *
     * @param preorder 前序遍历
     * @param inorder  中序遍历
     * @return 树的根结点
     */
    public static BinaryTreeNode construct(int[] preorder, int[] inorder) {
        // 输入的合法性判断，两个数组都不能为空，并且都有数据，而且数据的数目相同
        if (preorder == null || inorder == null || preorder.length != inorder.length || inorder.length < 1) {
            return null;
        }

        return construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二节树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     *
     * @param preorder 前序遍历
     * @param preStart       前序遍历的开始位置
     * @param preEnd       前序遍历的结束位置
     * @param inorder  中序遍历
     * @param inStart       中序遍历的开始位置
     * @param inEnd       中序遍历的结束位置
     * @return 树的根结点
     */
    public static BinaryTreeNode construct(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {

        // 开始位置大于结束位置说明已经没有需要处理的元素了
        if (preStart > preEnd) {
            return null;
        }
        // 取前序遍历的第一个数字，就是当前的根结点
        int currentRoot = preorder[preStart];
        int orderIndex = inStart;
        // 在中序遍历的数组中找根结点的位置
        while (orderIndex <= inEnd && inorder[orderIndex] != currentRoot) {
            orderIndex++;
        }

        // 如果在整个中序遍历的数组中没有找到，说明输入的参数是不合法的，抛出异常
        if (orderIndex > inEnd) {
            throw new RuntimeException("Invalid input");
        }

        // 创建当前的根结点，并且为结点赋值
        BinaryTreeNode node = new BinaryTreeNode();
        node.nodeValue = currentRoot;

        // 递归构建当前根结点的左子树，左子树的元素个数：orderIndex-inStart+1个
        // 左子树对应的前序遍历的位置在[preStart+1, preStart+orderIndex-inStart]
        // 左子树对应的中序遍历的位置在[inStart, orderIndex-1]
        node.left = construct(preorder, preStart + 1, preStart + orderIndex - inStart, inorder, inStart, orderIndex - 1);
        // 递归构建当前根结点的右子树，右子树的元素个数：inEnd-index个
        // 右子树对应的前序遍历的位置在[preStart+orderIndex-inStart+1, preEnd]
        // 右子树对应的中序遍历的位置在[orderIndex+1, inEnd]
        node.right = construct(preorder, preStart + orderIndex - inStart + 1, preEnd, inorder, orderIndex + 1, inEnd);

        // 返回创建的根结点
        return node;
    }
}
