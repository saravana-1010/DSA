package DesignPatterns.AbstractFactoryAndStrategy;

public interface VehicleFactory {
    Vehicle getVehicle(VehicleType vehicleType);
}
