import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/*Copyright ©  2018 Lyons. All rights reserved. */

/**
 * @Description: TODO
 * @ClassName: LinkedList
 * @author: lyons<zhanglei>
 * @date: 2018年1月14日 上午11:39:08
 * @version: [1.0]
 */
public class LinkedStack
{
   

    
    
    public static void hello(Class<? extends LinkedStack> aT )
    {
        System.out.println("hello"+aT);
    }
    
    static class test1 extends LinkedStack{
        
        /**
         * @Title:LinkedStack.test1
         * @Description:TODO
         */
        public test1()
        {
            System.out.println(test1.class.getName());
        }
        
    }
    static class test2{
        
        /**
         * @Title:LinkedStack.test1
         * @Description:TODO
         */
        public test2()
        {
            System.out.println(test2.class.getName());
        }
        
    }
    
    
    public static void main(String[] args) throws ClassNotFoundException, IOException
    {
//        
//        
//        test1 test1 = new test1();
//        
//        LinkedStack aLinkedStack = new LinkedStack();
//        
//        hello(test1.getClass());  
        
        File file = new File("11");
        
        if (file.exists())
        {
            file.delete();
            
        }
        
        
        
    }
    
    

    
    
//    private static class Node<U>{
//        U item;
//        Node<U> next;
//        /**
//         * @Title:LinkedStack.Node
//         * @Description:TODO
//         */
//        public Node()
//        {}
//    }
    
    
    
}
