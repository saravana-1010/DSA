package DesignPatterns.Facade;
public class TestClass {
    public static void main(String[] args) {
        Order order = new Order(new Product(), new Checkout(), new Payment());
        order.createOrder();
    }
}
