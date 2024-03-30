package DesignPatterns.AbstractFactoryAndStrategy;

public class LuxuryCar2 implements Vehicle {
    String name;
    DriveStrategy driveStrategy;

    public LuxuryCar2(String name, DriveStrategy driveStrategy) {
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
