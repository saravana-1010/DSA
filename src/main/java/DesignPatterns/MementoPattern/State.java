package DesignPatterns.MementoPattern;

public class State {
    int invoiceAmount;
    int tax;

    public State(int invoiceAmount, int tax) {
        this.invoiceAmount = invoiceAmount;
        this.tax = tax;
    }
}
