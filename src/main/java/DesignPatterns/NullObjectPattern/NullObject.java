package DesignPatterns.NullObjectPattern;

public class NullObject implements EngineVehicle {
    @Override
    public void turnOnEngine() {
        return;
    }

    @Override
    public void turnOffEngine() {
        return;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

}
