/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a19包含Min函数的栈; //O（1）


import java.util.Stack;

public class A19StackWithMin {

//    https://github.com/marsprince/SwordForOffer/blob/master/Problem21/MyStack.java


     Stack dataStack = new Stack();
     Stack minStack = new Stack();

    public void push(int data){

        if (dataStack.isEmpty()) {
            minStack.push(data);
        }else {
            int min = (int) minStack.peek();//peek 获取栈顶元素，并不删除
            if (min < data){
                minStack.push(min);
            }else {
                minStack.push(data);
            }
        }

        dataStack.push(data);

    }

    public Object pop(){
        minStack.pop();
        return dataStack.pop();
    }

    public Object min(){
        if (minStack.isEmpty()){
            throw new RuntimeException("栈为空");
        }else {
           return minStack.peek();
        }
    }

}
