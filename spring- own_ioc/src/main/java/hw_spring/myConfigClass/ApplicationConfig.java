package hw_spring.myConfigClass;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "hw_spring.myConfigClass")
public class ApplicationConfig {
}
