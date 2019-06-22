/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/21 11:18
 */
package a15反转链表_;

public class Mine {

    public static class ListNode {
        int value;
        ListNode next;
    }


    public static Mine.ListNode reverseList(Mine.ListNode head) {

        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        ListNode reverseHead = null;

        while (curr.next != null){

            next = curr.next;

            prev  = curr.next;

            curr = prev;

        }





        return reverseHead;


    }
}
