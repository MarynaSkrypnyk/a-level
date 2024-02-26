package hw_spring.myConfigClass;

import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Component
public class Car {
    private String model;
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
