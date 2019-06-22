/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 19:10
 */
package a12在时间删除链表结点; //a12在O(1)时间删除链表结点

import static a12在时间删除链表结点.A12DeleteNode.deleteNode;
import static a12在时间删除链表结点.A12DeleteNode.printList;

public class Test {


    public static void main(String[] args) throws Exception {
        A12DeleteNode.ListNode head = new A12DeleteNode.ListNode();
        head.value = 1;

        head.next = new A12DeleteNode.ListNode();
        head.next.value = 2;

        head.next.next = new A12DeleteNode.ListNode();
        head.next.next.value = 3;

        head.next.next.next = new A12DeleteNode.ListNode();
        head.next.next.next.value = 4;

        A12DeleteNode.ListNode middle = head.next.next.next.next = new A12DeleteNode.ListNode();
        head.next.next.next.next.value = 5;

        head.next.next.next.next.next = new A12DeleteNode.ListNode();
        head.next.next.next.next.next.value = 6;

        head.next.next.next.next.next.next = new A12DeleteNode.ListNode();
        head.next.next.next.next.next.next.value = 7;

        head.next.next.next.next.next.next.next = new A12DeleteNode.ListNode();
        head.next.next.next.next.next.next.next.value = 8;

        A12DeleteNode.ListNode last = head.next.next.next.next.next.next.next.next = new A12DeleteNode.ListNode();
        head.next.next.next.next.next.next.next.next.value = 9;

        head = deleteNode(head, null); // 删除的结点为空
        printList(head);
        A12DeleteNode.ListNode node = new A12DeleteNode.ListNode();
        node.value = 12;

        head = deleteNode(head, head); // 删除头结点
        printList(head);
        head = deleteNode(head, last); // 删除尾结点
        printList(head);
        head = deleteNode(head, middle); // 删除中间结点
        printList(head);

        head = deleteNode(head, node); // 删除的结点不在链表中
        printList(head);
    }


}
