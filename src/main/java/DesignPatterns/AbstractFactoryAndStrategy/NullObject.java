package DesignPatterns.AbstractFactoryAndStrategy;

public class NullObject implements Vehicle {
    @Override
    public void drive() {
        System.out.println("No drive");
    }

    @Override
    public String getName() {
        return "No name";
    }
}
