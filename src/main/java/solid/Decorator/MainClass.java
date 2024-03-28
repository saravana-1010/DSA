package solid.Decorator;

public class MainClass {
    public static void main(String[] args) {
        BasePizza pizza = new PaneerToppings(new CornToppings(new VegPizza()));
        System.out.println(pizza.getCost());

        BasePizza pizza2 = new PaneerToppings(new CornToppings(new NonVegPizza()));
        System.out.println(pizza2.getCost());
    }
}
