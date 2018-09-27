package a001.Singleton;

/**
 * 
 *单例模式-懒汉式
 */
public class Singleton02
{

    private Singleton02(){}
    
    private static Singleton02 instance;
    
    public static synchronized Singleton02 getInstance()
    {
        if (instance==null)
        {
            new Singleton02();
        }
        return instance;
    }
}
