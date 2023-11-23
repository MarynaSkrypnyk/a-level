package src.ua.skrypnyk.hw13;

import java.util.Comparator;

public class Triangle extends Shape implements Comparator <Triangle> {
    private double perimeter;
    private double area;
    int sideA;
    int sideB;
    int sideC;
    double height;

    @Override
    public String toString() {
        return "Triangle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    public Triangle(int sideA, int sideB, int sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public double perimeter() {
       return perimeter = sideA + sideB + sideC;

    }

    @Override
    public double area() {
       area(6,5,5);
       area(5,5);
       area(5,5.5);
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
        return area = 1/(double)2 * (sideA * height);

   }

    @Override
    public int compare(Triangle o1, Triangle o2) {
        return (int) (o1.area()-o2.area());
    }
}








