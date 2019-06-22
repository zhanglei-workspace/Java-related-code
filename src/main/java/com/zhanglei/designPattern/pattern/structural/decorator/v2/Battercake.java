package pattern.structural.decorator.v2;

/**
 * Created by geely
 * 角色：具体构件（Concrete Component）
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
