package src.ua.skrypnyk.hw10;

public class Circle extends Shape {
    private double perimeter;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    double radius;
    @Override
    public double area() {
        try {
            if (radius <= 0) {
                throw new InvalidDataException("Radius should be positive");
            }
            System.out.println(Math.PI * radius * radius);
        } catch (InvalidDataException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return area;
    }


    @Override
    public double perimeter() {;
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

}
