package DesignPatterns.Facade;

public class Order {
    Product product;
    Checkout checkout;
    Payment payment;

    public Order(Product product, Checkout checkout, Payment payment) {
        this.product = product;
        this.checkout = checkout;
        this.payment = payment;
    }

    public void createOrder() {
        product.addProduct();
        checkout.checkout();
        payment.pay();
    }
}
