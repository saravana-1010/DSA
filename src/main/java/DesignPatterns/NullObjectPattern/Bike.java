package DesignPatterns.NullObjectPattern;

public class Bike implements EngineVehicle {
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
        this.speed+=5;
    }

    public void decelerate() {
        this.speed-=5;
    }

    public int getSpeed() {
        return this.speed;
    }
}
