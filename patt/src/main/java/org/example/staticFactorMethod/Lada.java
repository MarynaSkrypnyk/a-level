package org.example.staticFactorMethod;

public class Lada extends Car {
    String model = "Lada";
    int number = 333;

    @Override
    public String toString() {
        return "Lada{" +
                "model='" + model + '\'' +
                ", number=" + number +
                '}';
    }


}
