package pattern.behavioral.state;

import lombok.Data;

/**
 * @Author: suxun
 * @Date: 2018/12/9 18:46
 * @Description:
 */
@Data
public abstract class CourseVideoState {

    protected CourseVideoContext courseVideoContext;

    public abstract void play();

    public abstract void speed();

    public abstract void pause();

    public abstract void stop();

    public CourseVideoContext getCourseVideoContext() {
        return courseVideoContext;
    }

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }
}
