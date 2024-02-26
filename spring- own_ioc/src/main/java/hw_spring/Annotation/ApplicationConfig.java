package hw_spring.Annotation;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "hw_spring.Annotation")
public class ApplicationConfig {
}
