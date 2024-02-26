package hw_spring.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserService bean = applicationContext.getBean(UserService.class);
        System.out.println(bean);

    }
}
