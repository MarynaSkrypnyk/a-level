package hw_spring.myConfigClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Car bean = applicationContext.getBean(Car.class);
        System.out.println(bean);
    }
}
