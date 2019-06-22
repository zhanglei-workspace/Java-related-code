package pattern.creational.factorymethod;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new MyVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();
        VideoFactory videoFactory4 = new MyVideoFactory();
        Video video = videoFactory4.getVideo();
        video.produce();

    }

}
