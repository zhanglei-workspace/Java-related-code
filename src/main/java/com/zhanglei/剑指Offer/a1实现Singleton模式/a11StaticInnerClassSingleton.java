/**
 * @Description: 静态内部类实现单例
 * @Auther: zhanglei
 * @Date: 2019/6/12 17:41
 */
package a1实现Singleton模式;

/* @Description: 静态内部类实现单例
 *  解决方案二：基于类初始化的延迟加载
 * 利用静态内部类，防止其他线程看到这三个步骤*/
public class a11StaticInnerClassSingleton {

    public static a11StaticInnerClassSingleton getInstace(){
        return InnerClass.instace;
    }
    private static class InnerClass{
        private static a11StaticInnerClassSingleton instace = new a11StaticInnerClassSingleton();
    }
    private a11StaticInnerClassSingleton(){
    }
}
