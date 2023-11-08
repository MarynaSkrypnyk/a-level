package src.ua.skrypnyk.hw10;

public class Shape {

    private double perimeter;
    private double area;

    public Shape (double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public void perimeter () {
        System.out.println("Perimeter "+ perimeter);
    }

    public double area (){
        System.out.println("Area "+ area);
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
    public double getArea() {
        return area;
    }
    Shape (){};

}
