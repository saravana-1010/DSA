package DesignPatterns.NullObjectPattern;

public class Car implements EngineVehicle {
    boolean engine;
    int speed;

    @Override
    public void turnOnEngine() {
        this.engine = true;
    }

    @Override
    public void turnOffEngine() {
        this.engine = false;
    }

    public void accelerate() {
        this.speed+=10;
    }

    public void decelerate() {
        this.speed-=10;
    }

    public int getSpeed() {
        return this.speed;
    }
}
