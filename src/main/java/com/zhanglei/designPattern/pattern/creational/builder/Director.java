package pattern.creational.builder;

/**
 * Created by geely
 */
public class Director {
    private Builder courseBuilder;

    public void setCourseBuilder(Builder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Product makeProduct(String courseName, String coursePPT,
                              String courseVideo, String courseArticle,
                              String courseQA){
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);
        return this.courseBuilder.makeProduct();
    }
}
