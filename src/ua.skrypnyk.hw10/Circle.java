package src.ua.skrypnyk.hw10;

public  class Circle extends Shape {
    private double perimeter;
    private double area;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
       area =  Math.PI * radius * radius;
       System.out.println("Circle area = " + area);
        return area;
    }
    @Override
    public double perimeter() {
       double perimeter = 2 * Math.PI * radius;
       return  perimeter;
    }
}
