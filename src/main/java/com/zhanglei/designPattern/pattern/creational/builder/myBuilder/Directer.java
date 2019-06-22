/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019-5-7 14:21
 */
package pattern.creational.builder.myBuilder;

public class Directer {

    public Human CreateHuman(CreateHuman createHuman){
        createHuman.builderBody();
        createHuman.builderFoot();
        createHuman.builderHand();
        createHuman.builderHead();
        return  createHuman.createHuman();
    }
}
