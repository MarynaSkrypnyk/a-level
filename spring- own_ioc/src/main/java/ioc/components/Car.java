package ioc.components;

import ioc.context.Component;
import lombok.Setter;

@Component(name = "myCar")
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
