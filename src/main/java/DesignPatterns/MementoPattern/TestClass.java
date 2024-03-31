package DesignPatterns.MementoPattern;

public class TestClass {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1, new State(100, 10), new CareTaker());
        Memento invoiceSnapshot1 =  invoice.createMementoObject();
        State state1 = new State(200, 20);
        invoice.setState(state1);
        Memento invoiceSnapshot2 = invoice.createMementoObject();
        State state2 = new State(300, 29);
        invoice.setState(state2);
        System.out.println("Current state: " + invoice.state.invoiceAmount + ", " + invoice.state.tax);
        Memento lastSnapshot = invoice.careTaker.restoreLastMementoObject();
        invoice.restoreState(lastSnapshot);
        State updatedState = invoice.getState();
        System.out.println(updatedState.tax + ", " + updatedState.invoiceAmount);
    }
}
