package DesignPatterns.MediatorPattern;

public class Colleague2 implements Colleague {
    AuctionMediator auctionMediator;
    String name;
    public Colleague2(String name) {
        this.name = name;
    }
    @Override
    public void setAuctionMediator(AuctionMediator auctionMediator) {
        this.auctionMediator = auctionMediator;
    }
    @Override
    public void placeBid(int amount) {
        auctionMediator.placeBid(amount, getName());
    }

    @Override
    public void receiveNotification(int amount) {
        System.out.println("Someone has placed a bid of amount " + amount);
    }

    @Override
    public String getName() {
        return name;
    }
}
