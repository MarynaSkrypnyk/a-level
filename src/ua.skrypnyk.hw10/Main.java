package src.ua.skrypnyk.hw10;

public class Main {

    public static void main(String[] args) {
        Shape square = new Square(15, 19);
        Shape circle = new Circle(20, 20);
        Shape triangle = new Triangle(20, 18);

        circle.area();
        square.area();
        triangle.area();
    }
}


