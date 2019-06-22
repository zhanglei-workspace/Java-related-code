/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019-5-7 14:17
 */
package pattern.creational.builder.myBuilder;

public class Zhanglei implements CreateHuman {

    Human human = new Human();
    @Override
    public void builderFoot() {
        human.setFoot("两个脚丫");
    }

    @Override
    public void builderHand() {
        human.setHand("双手");
    }

    @Override
    public void builderHead() {
        human.setHand("头");
    }

    @Override
    public void builderBody() {
        human.setBody("躯体");
    }

    @Override
    public Human createHuman() {
        return human;
    }
}
