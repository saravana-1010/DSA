package DesignPatterns.Observer;

public class Observer1 implements Observer {
    Observable observable;
    public Observer1(Observable observable) {
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Stock of the observable " + observable.getName() + " is " + observable.getData());
    }
}
