package org.example.staticFactorMethod;

public class Juk extends Car {
    String model = "Juk";
    int number = 222;

    @Override
    public String toString() {
        return "Juk{" +
                "model='" + model + '\'' +
                ", number=" + number +
                '}';
    }
}