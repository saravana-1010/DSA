package DesignPatterns.AbstractFactoryAndStrategy;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal car drive");
    }
}
