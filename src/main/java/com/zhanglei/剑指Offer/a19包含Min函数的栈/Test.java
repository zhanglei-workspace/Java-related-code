/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 19:10
 */
package a19包含Min函数的栈; //a12在O(1)时间删除链表结点


public class Test {


    public static void main(String[] args) throws Exception {

        A19StackWithMin stack = new A19StackWithMin();

        stack.push(45);
        stack.push(5);
        stack.push(1);
        stack.push(16);
        stack.push(1);

        System.out.println(stack.min());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.min());


    }
}
