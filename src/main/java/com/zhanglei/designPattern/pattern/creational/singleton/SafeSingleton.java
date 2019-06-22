/**
 * @Description: 较为全面的，安全的单例模式
 * @Auther: zhanglei
 * @Date: 2019-4-11 10:30
 */
package pattern.creational.singleton;

import java.io.Serializable;

public class SafeSingleton implements Serializable {
    //volatile 防止指令重排
    private static volatile SafeSingleton safeInstance = null;

    //私有构造器、防止反射攻击
    private SafeSingleton() throws Exception {
        if (safeInstance != null){
            throw new RuntimeException("不允许反射创建");
        }
    }

    /**
     * 对外提创建对象的方法
     */
    public static SafeSingleton getInstance() throws Exception {
        if (safeInstance == null){
            //加锁防止多线程创建
            synchronized (SafeSingleton.class){
                if (safeInstance == null){
                    safeInstance = new SafeSingleton();
                }
            }
        }
        return  safeInstance;
    }

    /**
     * 防止反序列化后，不再是一个对象
     */
    private Object readResolve(){return safeInstance;}
}
