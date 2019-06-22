package pattern.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Observable;

/**
 * @Author: suxun
 * @Date: 2018/12/9 16:50
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course extends Observable {
    public String getCourseName() {
        return courseName;
    }

    private String courseName;

    public void produceQuestion(Course course, Question question) {
        System.out.println("课程："+course.courseName + "  学生：" + question.getUserName());
        setChanged(); //改变状态，表明已有改变
        notifyObservers(question); //发出通知
    }
}
