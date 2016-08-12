package a001.Singleton;

/**
 * 
 *单例模式-饿汉式
 */
public class Singleton01
{
    /** 
     * 
     * 1.将方法私有化
     * 
     * 2.创建类的 唯一、私有、静态 实例对象
     * 
     * 3.创建对外获取的 静态 方法
     */

    private Singleton01(){}
    
    private static Singleton01 instance = new Singleton01();
    
    public static Singleton01 getInstance()
    {
        return instance;
    }
}
