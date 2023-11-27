package src.ua.skrypnyk.hw10;

//Perimeter and area should be calculated
public class Square extends Shape{
    private double perimeter;
    private double area;
    private double side;

    public Square(double side) {
        this.side = side;
        }

    @Override
    public double area() {
        try {

            if (side <= 0) {
                throw new InvalidDataException("Side should be bigger null");
            }
            System.out.println("Square area = "+ side * side);
        } catch (InvalidDataException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return area;
    }

    @Override
    public double perimeter() {
        perimeter = side + side + side + side;
       return perimeter;
    }
}
