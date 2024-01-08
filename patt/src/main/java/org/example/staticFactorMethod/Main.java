package org.example.staticFactorMethod;

public class Main {
    public static void main(String[] args) {
        SimpleCarFactory simpleCoffeeFactory = new SimpleCarFactory();
        CarAutoMagaz carAutoMagaz = new CarAutoMagaz(simpleCoffeeFactory);
        Car car = carAutoMagaz.orderCar(CarType.JUK);
        System.out.println(car.getClass().getSimpleName());
    }
}
