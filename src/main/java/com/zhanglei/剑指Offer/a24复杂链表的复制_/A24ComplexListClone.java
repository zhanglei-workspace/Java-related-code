/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a24复杂链表的复制_;


import java.util.HashMap;

public class A24ComplexListClone {

    /**
     * 复杂链表结点
     */
    public static class ComplexListNode {
        int value;
        ComplexListNode next;
        ComplexListNode sibling;
    }

    public static ComplexListNode clone(ComplexListNode head) {

        HashMap<ComplexListNode,ComplexListNode> map = new HashMap();
        ComplexListNode copyHead = copyNext(head,map);//复制next，串起来
//        ComplexListNode ComplexListHead = copySibling(copyHead,map);//复制sibling
        return  null;


    }

    private static ComplexListNode copyNext(ComplexListNode head, HashMap map) {
        ComplexListNode copyHead = new ComplexListNode();
        ComplexListNode copy = copyHead;

        ComplexListNode temp;

        while (head != null){
            temp = new ComplexListNode();
            temp.value = head.value;
            copy.next = temp;

            map.put(head.sibling,temp);
            copy = copy.next;
            head = head.next;
        }

        return copyHead.next;
    }

/*
    private static ComplexListNode copySibling(ComplexListNode copyHead, HashMap map) {

        ComplexListNode index = copyHead;
        while (index != null){
            index.sibling
            map.get(index.value);
        }
    }
*/


}
