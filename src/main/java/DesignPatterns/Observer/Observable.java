package DesignPatterns.Observer;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
    void setData(int data);
    int getData();
    String getName();
}
