/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a6用两个栈实现一个队列;


import java.util.Stack;

/*
用两个栈实现一个队列，完成两个函数appendTail和deletedHead，分别是在队列尾部插入节点和
在队列头部删除节点的功能
 */
public class A61StackOfQueque<T> {

    private Stack<T> stack1=new Stack<>();
    private Stack<T> stack2=new Stack<>();//缓存栈


    public void appendTail(T s)//改泛型
    {
        stack1.push(s);
    }

    public T deleteHead() throws Exception
    {

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        if(stack2.isEmpty())
        {
            throw new Exception("队列为空，不能删除");
        }

        T temp = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return temp;
    }

}
