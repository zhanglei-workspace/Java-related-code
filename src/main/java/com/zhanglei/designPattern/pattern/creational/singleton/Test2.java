/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019-2-15 14:17
 */
package pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test2 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = StaticInnerClassSingleton.class;
        Constructor constructor = c.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInnerClassSingleton scs = (StaticInnerClassSingleton) constructor.newInstance();

        System.out.println(scs);


    }
}
