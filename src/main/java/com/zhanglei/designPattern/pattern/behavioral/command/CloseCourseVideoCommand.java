package pattern.behavioral.command;


/**
 * @Author: suxun
 * @Date: 2018/12/9 17:56
 * @Description:
 */
public class CloseCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
