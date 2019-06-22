package pattern.creational.factorymethod;

/**
 * Created by geely
 */
public class MyVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new MyVideo();
    }
}
