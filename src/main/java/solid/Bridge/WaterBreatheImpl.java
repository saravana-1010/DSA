package solid.Bridge;

public class WaterBreatheImpl implements BreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("Breathing at water");
    }
}
