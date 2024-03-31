package DesignPatterns.TemplatePattern;

public class PayToFriend extends Payment {
    public PayToFriend(int money) {
        this.money = money;
    }

    @Override
    protected void debitMoney(int money) {
        System.out.println(money + " debited from sender acc");
    }

    @Override
    protected int calculateCharge() {
        System.out.println("Calculated charge is " + 0);
        return 0;
    }

    @Override
    protected void creditMoney() {
        System.out.println(money - calculateCharge() + " credited to receiver acc");
    }

    @Override
    protected void sendNotification() {
        System.out.println("Transaction is successful");
    }
}
