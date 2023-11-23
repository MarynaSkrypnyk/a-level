package src.ua.skrypnyk.hw13;

import java.util.Comparator;

public class Circle extends Shape implements Comparator <Circle> {
    private double perimeter;
    private double area;
    private double radius;

    @Override
    public String toString() {
        return "Circle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
       area =  Math.PI * radius * radius;
        return area;
    }
    @Override
    public double perimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }


    @Override
    public int compare(Circle o1, Circle o2) {
        return (int) (o1.area()-o2.area());
    }
}
