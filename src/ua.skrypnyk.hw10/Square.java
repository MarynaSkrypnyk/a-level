package src.ua.skrypnyk.hw10;
//Perimeter and area should be calculated
public class Square extends Shape{
    private double perimeter;
    private double area;

    public Square(double side) {
        this.side = side;
    }

    private double side;

    @Override
    public double area() {
        area = side * side;
        System.out.println("Square area = " + area);
        return area;
    }

    @Override
    public double perimeter() {
        perimeter = side + side + side + side;
       return perimeter;
    }
}
