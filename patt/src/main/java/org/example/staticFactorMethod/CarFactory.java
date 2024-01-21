package org.example.staticFactorMethod;


public class CarFactory {
    public static Car newCar(String carType) {
        return switch (carType) {
            case "Bmw" -> new Bmw();
            case "Juk" -> new Juk();
            case "Lada" -> new Lada();
            default -> throw new IllegalArgumentException("Unsupported box type: " + carType);
        };
    }
}

