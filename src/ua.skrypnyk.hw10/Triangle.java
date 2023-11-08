package src.ua.skrypnyk.hw10;

import java.util.Scanner;

public class Triangle extends Shape {
    private double perimeter;
    private double area;

    public Triangle(double perimeter, double area) {
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
    public void perimeter() {
        int sideA = 16;
        int sideB = 17;
        double sideC = 19.1;
        double perimeter = sideA + sideB + sideC;
        System.out.println("Triangle perimeter = "+ perimeter);
    }

    @Override
    public double area() {
        System.out.println("areaTriangleForHeronFormula = "+ area(16, 17, 19));
        System.out.println("areaTriangleForTwoSidesPerSineAngle = " + area(16,17));
        System.out.println("areaTriangleForBaseHeight = " + area(16, -17.9));
        return area;
    }
    public double area (int sideA, int sideB, int sideC) {
        double perimeter = (sideA + sideB + sideC) / (double) 2;
        return area  = Math.sqrt(perimeter * ((perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC)));
    }

    public double area (int sideA, int sideB) {
        return area = Math.sqrt(1/(double)2) * (sideA * sideB * Math.sin(45));
    }
    public double area (int sideA, double height){
            try {
                if (height <= 0) {
                    throw new CheckedException("Triangle height should be bigger null");
                }
                System.out.println("Triangle perimeter = " + 1/(double)2 * sideA * height);
            } catch (CheckedException exception) {
                exception.printStackTrace();
                System.out.println(exception.getMessage());
            }
     return area;
   }
}








