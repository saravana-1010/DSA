package DesignPatterns.AbstractFactoryAndStrategy;

public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(VehicleType vehicleType) {
        if (VehicleType.Audi.equals(vehicleType)) {
            return new LuxuryCar1("Audi", new LuxuryDrive());
        } else if(VehicleType.BMW.equals(vehicleType)) {
            return new LuxuryCar2("BMW", new LuxuryDrive());
        } else {
            return new NullObject();
        }
    }
}
