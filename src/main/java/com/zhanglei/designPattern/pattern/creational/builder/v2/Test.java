package pattern.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Course course = (new Course.CourseBuilder())//打上括号就好理解了,每一个点都是对当前对象的操作
                .buildCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseVideo("Java设计模式精讲视频")
                .build();
        System.out.println(course);

        System.out.println(course.getCourseName());;

//        Set<String> set = ImmutableSet.<String>builder().add("a").add("b").build();
//
//        System.out.println(set);
    }
}
