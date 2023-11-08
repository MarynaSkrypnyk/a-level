package src.ua.skrypnyk.hw10;

import java.util.Scanner;

//Perimeter and area should be calculated
public class Square extends Shape{
    private double perimeter;
    private double area;
    private double side = -4;

    public Square(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
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

            if (side <= 0) {
                throw new CheckedException("Side should be bigger null");
            }
            System.out.println("Square area = "+ side * side);
        } catch (CheckedException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return area;
    }
    @Override
    public void perimeter() {
        perimeter = side + side + side + side;
        System.out.println("Square perimeter= "+ perimeter);
    }
}
