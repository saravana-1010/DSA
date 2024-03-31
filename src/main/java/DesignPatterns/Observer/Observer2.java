package DesignPatterns.Observer;

public class Observer2 implements Observer {
    Observable observable;
    public Observer2(Observable observable) {
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Stock of the observable " + observable.getName() + " is " + observable.getData());
    }
}
