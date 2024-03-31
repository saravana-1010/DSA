package DesignPatterns.AbstractFactoryAndStrategy;


public class TestClass {
    public static void main(String[] args) {
        VehicleFactory luxuryVehicleFactory = AbstractFactory.getVehicleFactory(VehicleFactoryType.LuxuryVehicleFactory);
        VehicleFactory normalVehicleFactory = AbstractFactory.getVehicleFactory(VehicleFactoryType.NormalVehicleFactory);
        Vehicle bmw = luxuryVehicleFactory.getVehicle(VehicleType.BMW);
        Vehicle hyundai = normalVehicleFactory.getVehicle(VehicleType.Hyundai);
        Vehicle ev = normalVehicleFactory.getVehicle(VehicleType.EV);
        ev.drive();
        hyundai.drive();
        bmw.drive();
    }
}
