package solid.Bridge;

public class LandBreatheImpl implements BreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("Breathing at land");
    }
}
