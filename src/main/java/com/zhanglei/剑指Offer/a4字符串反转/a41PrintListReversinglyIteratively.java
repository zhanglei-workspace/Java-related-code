/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a4字符串反转;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class a41PrintListReversinglyIteratively {

    public static List revert(List link)
    {
        Stack stack = new Stack();
        List list = new ArrayList();

        for (int i = 0; i < link.size(); i++) {
            stack.push(link.get(i));
        }
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;


    }
}
