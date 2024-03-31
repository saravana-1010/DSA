package DesignPatterns.AbstractFactoryAndStrategy;

public class NormalVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(VehicleType vehicleType) {
        if (VehicleType.Hyundai.equals(vehicleType)) {
            return new NormalCar1("Hyundai", new NormalDrive());
        } else if(VehicleType.Honda.equals(vehicleType)) {
            return new NormalCar2("Honda", new NormalDrive());
        } else {
            return new NullObject();
        }
    }
}
