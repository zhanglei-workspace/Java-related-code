/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/14 09:05
 */
package pattern.creational.factorymethod;

public class MyVideo extends Video {
    @Override
    public void produce() {
        System.out.println("这个我吗video");
    }
}
