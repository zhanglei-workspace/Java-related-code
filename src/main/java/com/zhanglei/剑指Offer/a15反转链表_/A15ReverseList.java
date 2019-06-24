/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a15反转链表_; //O（1）


import a0utiles.ListNode;

public class A15ReverseList {


    /**
     * 定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点。
     *
     * @param head 链表的头结点
     * @return 反转后的链表的头结点
     */
    public static ListNode reverseList(ListNode head) {
        // 用于记录反转后的链表的头结点
        ListNode reverseHead = null;
        // 用于记录当前处理的结点的
        ListNode curr = head;
        // 用于记录当前结点的前驱结点
        // 前驱结点开始为null，因为了是反转后的最后一个结点的下一个结点，即null
        ListNode prev = null;
        // 当前结点的下一个结点
        ListNode next;

        // 对链表进行尾插法操作
        while (curr != null) {
            // 记录当前处理的结点，最后一个记录的结点就是反转后的头结点
            // 【注意：与书上的不同，因为curr.next=null时，curr此时就最后一个处理的结点，
            // 对应到反转后的链表就是第一个结点，书上那样做更精确，只是多了一些判断，可以不要if】
            reverseHead = curr;
            // 记录当然前下一个结点
            next = curr.next;
            // 当前结点的下一个结点指向前驱结点，这样当前结点就插入到了反转链表的头部
            curr.next = prev;
            // 记录当前结点为前驱结点
            prev = curr;
            // 当前结点点移动到下一个结点
            curr = next;
        }

        // 返回转后的头结点
        return reverseHead;


    }


}
