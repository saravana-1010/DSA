package DesignPatterns.MementoPattern;

public class Memento {
    State state;

    public Memento(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
