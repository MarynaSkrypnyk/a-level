package src.ua.skrypnyk.hw10;

import java.util.Scanner;

public class Circle extends Shape {
    private double perimeter;
    private double area;
    private int radius;

    public Circle(double perimeter, double area) {
        this.area = area;
        this.perimeter = perimeter;
    }
    @Override
    public double getPerimeter() {
        return perimeter;
    }
    @Override
    public double getArea() {
        return area;
    }
    @Override
    public double area() {

        try {
            System.out.println("Enter circle radius");
            Scanner scanner = new Scanner(System.in);
            int radius = scanner.nextInt();
            if (radius <= 0) {
                throw new CheckedException("Radius should be positive");
            }
            System.out.println(Math.PI * radius * radius);
        } catch (CheckedException exception) {
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
