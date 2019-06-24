/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a16合并两个排序的链表; //O（1）


import a0utiles.ListNode;

public class A16MergeList {


    /**
     * 输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的
     *
     * @param head1 第一个有序链表
     * @param head2 第二个有序链表
     * @return 合并后的有序链表头
     */
    public static ListNode merge(ListNode head1, ListNode head2) {

        if (head1 == null ) return head2;
        if (head2 == null) return  head1;

        ListNode root = new ListNode();//新链的头结点(不是真正的数据节点)
        ListNode pointer = root;

        while (head1 != null && head2 != null){
            if (head1.value < head2.value){
                pointer.next = head1;
                head1 = head1.next;
            }else {
                pointer.next = head2;
                head2 = head2.next;
            }

            pointer = pointer.next;
        }


        if (head1 != null){
            pointer.next = head1;
        }else {
            pointer.next = head2;
        }
        return root.next;
    }

}
