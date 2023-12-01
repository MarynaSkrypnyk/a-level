package src.ua.skrypnyk.hw14;

import java.util.Comparator;

public class Circle {
    private double area;
    private double perimeter;

    public Circle(double area, double perimeter) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public double area() {
        return area;
    }
    public double perimeter() {
        return perimeter;
    }

    @Override
    public String toString() {
        return String.valueOf(area);
    }
}
