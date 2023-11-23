package src.ua.skrypnyk.hw13;

import java.util.Comparator;

public class Square extends Shape implements Comparator <Square> {
    private double perimeter;
    private double area;
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    @Override
    public double area() {
        area = side * side;
        return area;
    }

    @Override
    public double perimeter() {
        return perimeter = side + side + side + side;
    }

    @Override
    public int compare(Square o1, Square o2) {
        return (int) (o1.area()-o2.area());
    }
}
