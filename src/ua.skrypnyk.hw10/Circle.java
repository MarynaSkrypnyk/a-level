package src.ua.skrypnyk.hw10;

public class Circle extends Shape {
    private double perimeter;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius = 4;

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
       area =  Math.PI * radius * radius;
       System.out.println("Circle area = " + area);
        return area;
    }
    @Override
    public void perimeter() {
        double perimeter = 18;
        perimeter = 2 * Math.PI * radius;
        System.out.println("Circle perimeter = " + perimeter);
    }
}
