package DesignPatterns.MementoPattern;

public class Invoice {
    int invoiceNo;
    State state;
    CareTaker careTaker;
    public Invoice(int i, State state, CareTaker careTaker) {
        this.invoiceNo = i;
        this.state = state;
        this.careTaker = careTaker;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Memento createMementoObject() {
        Memento memento = new Memento(state);
        careTaker.addMemento(memento);
        return memento;
    }

    public void restoreState(Memento memento) {
        this.state = memento.state;
    }
}
