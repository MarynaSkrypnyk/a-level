package hw_spring.xml;

import lombok.Setter;

@Setter
public class Car {
    private String model;
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
