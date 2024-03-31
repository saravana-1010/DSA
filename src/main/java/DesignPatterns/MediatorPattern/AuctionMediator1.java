package DesignPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator1 implements AuctionMediator {
    List<Colleague> colleagueList;
    public AuctionMediator1(List<Colleague> colleagueList) {
        this.colleagueList = new ArrayList<>(colleagueList);
    }
    @Override
    public void placeBid(int amount, String name) {
        for (Colleague colleague : colleagueList) {
            if(!colleague.getName().equalsIgnoreCase(name)) {
                colleague.receiveNotification(amount);
            }
        }
    }
}
