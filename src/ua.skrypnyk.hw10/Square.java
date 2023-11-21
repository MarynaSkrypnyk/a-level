package src.ua.skrypnyk.hw10;

import java.util.Scanner;

//Perimeter and area should be calculated
public class Square extends Shape{
    private double perimeter;
    private double area;
    private double side;

    public Square(double side) {
        this.side = side;
        }

    @Override
    public double area() {
        try {

            if (side <= 0) {
                throw new isAreaOfShapeValid("Side should be bigger null");
            }
            System.out.println("Square area = "+ side * side);
        } catch (isAreaOfShapeValid exception) {
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
