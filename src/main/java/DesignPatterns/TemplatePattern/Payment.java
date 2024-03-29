package DesignPatterns.TemplatePattern;

public abstract class Payment {
    int money;
    protected abstract void debitMoney(int money);
    protected abstract int calculateCharge();
    protected abstract void creditMoney();
    protected abstract void sendNotification();
    public void pay() {
        debitMoney(money);
        calculateCharge();
        creditMoney();
        sendNotification();
    }
}
