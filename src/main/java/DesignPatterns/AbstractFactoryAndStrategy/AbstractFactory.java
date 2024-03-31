package DesignPatterns.AbstractFactoryAndStrategy;

import DesignPatterns.AbstractFactoryAndStrategy.VehicleFactory;

public class AbstractFactory {
    public static VehicleFactory getVehicleFactory(VehicleFactoryType vehicleFactoryType) {
        if (VehicleFactoryType.LuxuryVehicleFactory.equals(vehicleFactoryType)) {
            return new LuxuryVehicleFactory();
        } else {
            return new NormalVehicleFactory();
        }
    }
}
