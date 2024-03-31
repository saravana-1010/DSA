package DesignPatterns.MediatorPattern;

public interface Colleague {
    void placeBid(int amount);
    void receiveNotification(int amount);
    String getName();
    void setAuctionMediator(AuctionMediator auctionMediator);
}
