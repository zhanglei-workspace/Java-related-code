/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:06
 */
package a1实现Singleton模式;

/*
    1.分配内存给这个对象
    3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
    2.初始化对象
    //步骤2,3 会发生指令重排序，多线程下，会出现 线程1没有初始化的情况下，
    线程2判断对象不为空(线程1执行了步骤3而没有执行步骤2)，从而在访问对象数据时候，抛异常
*/
public class a12HungrySingleton {

    public static volatile a12HungrySingleton instance = null;

    private a12HungrySingleton(){
        if (instance != null){
            throw new RuntimeException("禁止反射创建实例");
        }
    }

    public a12HungrySingleton getInstance(){
        if (instance == null){
            synchronized (a12HungrySingleton.class){
                if (instance == null){
                    instance = new a12HungrySingleton();
                }
            }
        }
        return instance;
    }

    /**
     * 如下解决：防止反序列化后，不再是一个对象
     * 反序列化是通过反射创建对象
     * 原理：在反序列化的时候，会去检查是否有readResolve这个方法，如果有那么就覆盖通过反射出来的对象。
     *
     */
    private Object readResolve(){return instance;}

}
