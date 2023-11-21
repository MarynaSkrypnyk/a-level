package src.ua.skrypnyk.hw10;

public class Main {

    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        square.perimeter();
        circle.perimeter();
        triangle.perimeter();

        triangle.area();
        circle.area();
        square.area();


        System.out.println(
                square.area() > circle.area()? square.area() > triangle.area() ? "square area bigger" : "triangle area bigger":
                triangle.area() > circle.area() ?"triangle area bigger" : "circle area bigger");

        }
    }



