package DesignPatterns.AbstractFactoryAndStrategy;

public class LuxuryDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Luxury car drive");
    }
}
