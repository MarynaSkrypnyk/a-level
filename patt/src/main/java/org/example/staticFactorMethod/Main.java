package org.example.staticFactorMethod;

public class Main {
    public static void main(String[] args) {
       Car carBMW = CarFactory.newCar("Bmw");
        System.out.println(carBMW);

    }
}
