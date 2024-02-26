package hw_spring.xml;
import hw_spring.xml.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContext {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Car car = context.getBean("car1",Car.class);
        System.out.println(car);

////        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
////        Car bean = applicationContext.getBean(Car.class);
////        System.out.println(bean);
//
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        UserService bean = applicationContext.getBean(UserService.class);
//        System.out.println(bean);

    }
}
