package solid.Bridge;

public class Cat extends LivingOrg {
    public Cat(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathe() {
        breatheImplementor.breathe();
    }
}
