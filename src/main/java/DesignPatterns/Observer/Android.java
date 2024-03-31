package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Android implements Observable {
    List<Observer> observerList;
    int count;
    public Android(int count) {
        this.observerList = new ArrayList<>();
        this.count = count;
    }
    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setData(int data) {
        count+=data;
    }

    @Override
    public int getData() {
        return count;
    }

    @Override
    public String getName() {
        return "Android";
    }
}
