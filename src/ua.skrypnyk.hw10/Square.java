package ua.skrypnyk.hw10;

public class Square extends Shapes{
    private double perimeter;
    private double area;
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
}
