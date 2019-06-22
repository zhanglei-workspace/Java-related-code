/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019-5-7 14:27
 */
package pattern.creational.builder.myBuilder;

public class Test {


    public static void main(String[] args) {
        Directer directer = new Directer();
        Human me = directer.CreateHuman(new Zhanglei());

        System.out.println(me);

    }
}
