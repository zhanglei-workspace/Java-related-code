/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a14链表的倒数第k个节点; //O（1）


import java.util.List;

public class A14FindKthToTail {

    public static class ListNode {
        int value;
        ListNode next;
    }

    /**
     * 输入一个键表，输出该链表中倒数第k 个结点．为了符合大多数人的习惯，
     * 本题从1开始计数，即链表的尾结点是倒数第1个结点．例如一个链表有6个结点，
     * 从头结点开始它们的值依次是1、2、3、4、5 6。这个链表的倒数第3个结点是值为4的结点．
     *
     * @param head 链表的头结点
     * @param k    倒数第k个结点
     * @return 倒数第k个结点
     */
    public static ListNode findKthToTail(ListNode head, int k) {
        int i = 0,j = 0;//两个指针，一个快一个慢

        ListNode tempi = head;
        for (int p = 0; p < k-1; p++) { //快的先达到差值
            tempi = tempi.next;
        }

        while (tempi.next != null){//快的到达终点时，慢的恰好到题目指定节点
            tempi = tempi.next;
            head = head.next;
        }

        return  head;

    }


}
