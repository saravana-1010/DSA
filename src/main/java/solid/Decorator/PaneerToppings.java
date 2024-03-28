package solid.Decorator;

public class PaneerToppings extends Toppings {
    public PaneerToppings(BasePizza basePizza) {
        super(basePizza);
    }
    @Override
    public int getCost() {
        return super.getCost() + 75;
    }
}
