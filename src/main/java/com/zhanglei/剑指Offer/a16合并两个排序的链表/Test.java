/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 19:10
 */
package a16合并两个排序的链表; //a12在O(1)时间删除链表结点


import static a16合并两个排序的链表.A16MergeList.merge;

public class Test {


    public static void main(String[] args) throws Exception {
        A16MergeList.ListNode head = new A16MergeList.ListNode();
        head.value = 1;

        head.next = new A16MergeList.ListNode();
        head.next.value = 2;

        head.next.next = new A16MergeList.ListNode();
        head.next.next.value = 3;

        head.next.next.next = new A16MergeList.ListNode();
        head.next.next.next.value = 4;

        head.next.next.next.next = new A16MergeList.ListNode();
        head.next.next.next.next.value = 5;


        A16MergeList.ListNode head2 = new A16MergeList.ListNode();
        head2.value = 1;

        head2.next = new A16MergeList.ListNode();
        head2.next.value = 3;

        head2.next.next = new A16MergeList.ListNode();
        head2.next.next.value = 5;

        head2.next.next.next = new A16MergeList.ListNode();
        head2.next.next.next.value = 6;

        head2.next.next.next.next = new A16MergeList.ListNode();
        head2.next.next.next.next.value = 7;

        head = merge(head, head2);
        printList(head);
    }

    /**
     * 输出链表的元素值
     *
     * @param head 链表的头结点
     */
    public static void printList(A16MergeList.ListNode head) {
        while (head != null) {
            System.out.print(head.value + "->");
            head = head.next;
        }
        System.out.println("null");
    }


}
