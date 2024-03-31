package DesignPatterns.AbstractFactoryAndStrategy;

public class LuxuryCar1 implements Vehicle {
    String name;
    DriveStrategy driveStrategy;

    public LuxuryCar1(String name, DriveStrategy driveStrategy) {
        this.name = name;
        this.driveStrategy = driveStrategy;
    }

    @Override
    public void drive() {
        driveStrategy.drive();
    }

    @Override
    public String getName() {
        return name;
    }
}
