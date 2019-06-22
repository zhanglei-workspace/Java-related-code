package pattern.behavioral.command;

/**
 * @Author: suxun
 * @Date: 2018/12/9 17:56
 * @Description:
 */
public class OpenCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
