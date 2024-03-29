package DesignPatterns.NullObjectPattern;

public class VehicleFactory {
    public static EngineVehicle getVehicle(VehicleType vehicleType) {
        if(VehicleType.Car.equals(vehicleType)) {
            return new Car();
        } else if (VehicleType.Bike.equals(vehicleType)) {
            return new Bike();
        } else {
            return new NullObject();
        }
    }
}
