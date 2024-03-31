package DesignPatterns.NullObjectPattern;

public class TestClass {
    public static void main(String[] args) {
        Car car = (Car) VehicleFactory.getVehicle(VehicleType.Car);
        car.turnOnEngine();
        car.accelerate();
        car.accelerate();
        car.decelerate();
        System.out.println(car.getSpeed());

        EngineVehicle vehicle = VehicleFactory.getVehicle(VehicleType.Truck);
        vehicle.turnOnEngine();
        System.out.println(vehicle.getSpeed());
    }
}
