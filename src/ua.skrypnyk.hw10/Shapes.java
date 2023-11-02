package ua.skrypnyk.hw10;

public class Shapes {

    private double perimeter;
    private double area;

    public Shapes(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public void perimeter () {
        System.out.println("Perimeter ");
    }

    public void area () {
        System.out.println("area ");
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
    Shapes (){};
}
