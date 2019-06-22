package pattern.creational.builder;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Builder courseBuilder = new ConcreteBuilder();
        Director coach = new Director();
        coach.setCourseBuilder(courseBuilder);

        Product course = coach.makeProduct("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);

    }
}
