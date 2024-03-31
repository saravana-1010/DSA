package DesignPatterns.MementoPattern;

import java.util.Stack;

public class CareTaker {
    Stack<Memento> stack;
    public CareTaker() {
        stack = new Stack<>();
    }
    public void addMemento(Memento memento) {
        stack.push(memento);
    }
    public Memento restoreLastMementoObject() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.pop();
    }
}
