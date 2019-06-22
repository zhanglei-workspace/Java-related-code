/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/13 09:11
 */
package a5重建二叉树_;

public class my {

    public static class BinaryTree{
        int value;
        BinaryTree leftNode;
        BinaryTree rightNode;
    }

    public static BinaryTree construct(int[] preOrder,int [] inOrder){
        if (preOrder == null || inOrder == null || preOrder.length != inOrder.length || inOrder.length < 1) {
            return null;
        }
        return constructCore(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
    }

    private static BinaryTree constructCore(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {

        if (preStart > preEnd) return null;

        int orderIndex = inStart;
        int currentRoot = preOrder[preStart];

        while (inOrder[orderIndex]!= currentRoot && orderIndex <= inEnd){
            orderIndex++;
        }

        BinaryTree node = new BinaryTree();
        node.value = currentRoot;

            node.leftNode = constructCore(preOrder,preStart +1,preStart+(orderIndex-inStart),inOrder,inStart,orderIndex-1);
            node.rightNode = constructCore(preOrder,preStart+(orderIndex-inStart)+1,preEnd,inOrder,orderIndex+1,inEnd);

        return node;
    }


}
