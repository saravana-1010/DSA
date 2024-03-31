package solid.Bridge;

public abstract class LivingOrg {
    public BreatheImplementor breatheImplementor;
    public LivingOrg(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }
    public abstract void breathe();
}
