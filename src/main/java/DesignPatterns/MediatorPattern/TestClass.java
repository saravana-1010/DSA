package DesignPatterns.MediatorPattern;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        Colleague colleague1 = new Colleague1("Colleague1");
        Colleague colleague2 = new Colleague2("Colleague2");
        AuctionMediator auctionMediator1 = new AuctionMediator1(Arrays.asList(colleague1, colleague2));
        colleague1.setAuctionMediator(auctionMediator1);
        colleague2.setAuctionMediator(auctionMediator1);
        colleague1.placeBid(200);
        colleague2.placeBid(300);
        colleague1.placeBid(350);
    }
}
