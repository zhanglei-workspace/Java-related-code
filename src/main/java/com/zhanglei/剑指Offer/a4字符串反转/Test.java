/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 19:10
 */
package a4字符串反转;

import java.util.LinkedList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        List link = new LinkedList();
        for (int i = 0; i < 10; i++) {
            link.add(i);
        }
        System.out.println(a41PrintListReversinglyIteratively.revert(link));
    }
}
