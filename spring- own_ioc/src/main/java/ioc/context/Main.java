package ioc.context;

import ioc.components.Car;
import ioc.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext("ioc.components");
        Car myCar = applicationContext.getComponent("myCar", Car.class);
        System.out.println(myCar);


    }




}
