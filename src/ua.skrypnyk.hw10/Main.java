package src.ua.skrypnyk.hw10;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(6);
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(5,6,7);

        circle.area();
        square.area();
        triangle.area();
    }
}


