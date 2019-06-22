package pattern.behavioral.command;

/**
 * @Author: suxun
 * @Date: 2018/12/9 18:00
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("java");
        Command openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        Command closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);



        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);
        staff.executeCommands();
    }
}
