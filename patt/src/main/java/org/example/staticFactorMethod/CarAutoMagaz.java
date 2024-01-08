package org.example.staticFactorMethod;

public class CarAutoMagaz {
    private final CarFactory carFactory;
    public CarAutoMagaz(CarFactory carFactory) {
        this.carFactory = carFactory;
    }
    public Car orderCar(CarType type) {
        Car car = carFactory.createCar(type);
        car.createCar();
        car.buyCar();
        car.driveCar();

        System.out.println("Cute auto");
        return car;
    }
}

