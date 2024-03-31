package DesignPatterns.Observer;

public class TestClass {
    public static void main(String[] args) {
        Observable iphone = new Iphone(10);
        Observable android = new Android(20);
        Observer observer1 = new Observer1(iphone);
        Observer observer2 = new Observer2(android);
        iphone.add(observer1);
        android.add(observer2);
        iphone.notifyObservers();
        android.notifyObservers();
        System.out.println();

        iphone.setData(10);
        android.setData(20);
        iphone.notifyObservers();
        android.notifyObservers();
        System.out.println();

        iphone.remove(observer1);
        iphone.notifyObservers();
        android.notifyObservers();
    }
}
