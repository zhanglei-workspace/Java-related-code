/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 19:10
 */
package a6用两个栈实现一个队列;

public class Test {


    public static void main(String[] args) throws Exception {
        A61StackOfQueque<String> link = new A61StackOfQueque();
        link.appendTail("i");
        link.appendTail("am");
        link.appendTail("zhanglei");

        link.deleteHead();

    }


}
