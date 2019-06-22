package pattern.behavioral.state;


/**
 * @Author: suxun
 * @Date: 2018/12/9 18:53
 * @Description:
 */
public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
