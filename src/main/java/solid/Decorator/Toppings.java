package solid.Decorator;

public abstract class Toppings extends BasePizza {
    BasePizza basePizza;
    public Toppings(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost();
    }
}
