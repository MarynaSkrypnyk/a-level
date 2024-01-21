package org.example.staticFactorMethod;

public class Bmw extends Car {
    String model = "Bmw";
    int number = 111;

    @Override
    public String toString() {
        return "Bmw{" +
                "model='" + model + '\'' +
                ", number=" + number +
                '}';
    }
}
