package pattern.behavioral.observer;

/**
 * 原理：
 *  被观察者继承Observable类
 *  观察者实现Observer类重写update方法
 *
 *  1.观察者将观察者（对象）添加到Vector集合中
 *  2.被观察者调父类的方法（notifyObservers），该方法遍历Vector中的对象并调用update方法的业务逻辑
 *
 *
 * @Author: suxun
 * @Date: 2018/12/9 16:55
 * @Description:
 * @Description: 观察者模式
        当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("java");
        Teacher teacher1 = new Teacher("teacher1");
        Teacher teacher2 = new Teacher("teacher2");
        course.addObserver(teacher1);
        course.addObserver(teacher2);

        //
        Question question = new Question("王磊", "字符串的编译");

        course.produceQuestion(course,question);
    }
}
