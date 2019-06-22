/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 19:10
 */
package a14链表的倒数第k个节点; //a12在O(1)时间删除链表结点

import a12在时间删除链表结点.A12DeleteNode;

import static a14链表的倒数第k个节点.A14FindKthToTail.findKthToTail;

public class Test {


    public static void main(String[] args) throws Exception {
        A14FindKthToTail.ListNode head = new A14FindKthToTail.ListNode();
        head.value = 1;

        head.next = new A14FindKthToTail.ListNode();
        head.next.value = 2;

        head.next.next = new A14FindKthToTail.ListNode();
        head.next.next.value = 3;

        head.next.next.next = new A14FindKthToTail.ListNode();
        head.next.next.next.value = 4;

        head.next.next.next.next = new A14FindKthToTail.ListNode();
        head.next.next.next.next.value = 5;

        head.next.next.next.next.next = new A14FindKthToTail.ListNode();
        head.next.next.next.next.next.value = 6;

        head.next.next.next.next.next.next = new A14FindKthToTail.ListNode();
        head.next.next.next.next.next.next.value = 7;

        head.next.next.next.next.next.next.next = new A14FindKthToTail.ListNode();
        head.next.next.next.next.next.next.next.value = 8;

        head.next.next.next.next.next.next.next.next = new A14FindKthToTail.ListNode();
        head.next.next.next.next.next.next.next.next.value = 9;

        System.out.println(findKthToTail(head, 1).value); // 倒数第一个
        System.out.println(findKthToTail(head, 5).value); // 中间的一个
        System.out.println(findKthToTail(head, 9).value); // 倒数最后一个就是顺数第一个

        System.out.println(findKthToTail(head, 10));
    }



}
