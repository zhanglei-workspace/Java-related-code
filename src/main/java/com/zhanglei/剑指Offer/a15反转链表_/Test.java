/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 19:10
 */
package a15反转链表_; //a12在O(1)时间删除链表结点


import a0utiles.ListNode;

import static a15反转链表_.A15ReverseList.reverseList;

public class Test {


    public static void main(String[] args) throws Exception {
        ListNode head = new ListNode();
        head.value = 1;

        head.next = new ListNode();
        head.next.value = 2;

        head.next.next = new ListNode();
        head.next.next.value = 3;

        head.next.next.next = new ListNode();
        head.next.next.next.value = 4;

        head.next.next.next.next = new ListNode();
        head.next.next.next.next.value = 5;

        head.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.value = 6;

        head.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.value = 7;

        head.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.value = 8;

        head.next.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.next.value = 9;

        printList(head);
        head = reverseList(head);
        printList(head);
        head = reverseList(head);
        printList(head);
    }

    /**
     * 输出链表的元素值
     *
     * @param head 链表的头结点
     */
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + "->");
            head = head.next;
        }
        System.out.println("null");
    }


}
