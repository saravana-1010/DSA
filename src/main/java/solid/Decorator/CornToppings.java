package solid.Decorator;

public class CornToppings extends Toppings {

    public CornToppings(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCost() {
        return super.getCost() + 50;
    }
}
