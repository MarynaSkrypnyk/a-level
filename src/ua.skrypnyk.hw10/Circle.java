package src.ua.skrypnyk.hw10;

import java.util.Scanner;

public class Circle extends Shape {
    private double perimeter;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    double radius = 11.1;
    @Override
    public double area() {
        try {
            if (radius <= 0) {
                throw new isAreaOfShapeValid("Radius should be positive");
            }
            System.out.println(Math.PI * radius * radius);
        } catch (isAreaOfShapeValid exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return area;
    }


    @Override
    public void perimeter() {
        double perimeter = 18;
        perimeter = 2 * Math.PI * radius;
        System.out.println("Circle perimeter = " + perimeter);
    }

}
