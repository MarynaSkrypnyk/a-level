package ua.skrypnyk.hw10;

public class Circle extends Shapes {
    private double perimeter;
    private double area;

    public Circle(double perimetr, double area) {
        this.area = area;
        this.perimeter = perimetr;
    }
    @Override
    public double getPerimeter() {
        return perimeter;
    }
    @Override
    public double getArea() {
        return area;
    }
}
