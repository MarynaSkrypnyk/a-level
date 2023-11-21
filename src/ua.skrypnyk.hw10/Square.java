package src.ua.skrypnyk.hw10;
//Perimeter and area should be calculated
public class Square extends Shape{
    private double perimeter;
    private double area;
    private double side = 4;

    @Override
    public double area() {
        area = side * side;
        System.out.println("Square area = " + area);
        return area;
    }

    @Override
    public void perimeter() {
        perimeter = side + side + side + side;
        System.out.println("Square perimeter= "+ perimeter);
    }
}
