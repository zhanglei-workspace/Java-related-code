package pattern.behavioral.state;


/**
 * @Author: suxun
 * @Date: 2018/12/9 18:53
 * @Description:
 */
public class StopState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);

    }

    @Override
    public void speed() {
        System.out.println("err not speed");
    }

    @Override
    public void pause() {
        System.out.println("err not pause");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
