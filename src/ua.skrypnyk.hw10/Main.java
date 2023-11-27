package src.ua.skrypnyk.hw10;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(7);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(76,56,86,18,30);

        double areaSquare = square.area();
        double areaCircle = circle.area();
        double areaTriangle = triangle.area();

        System.out.println(
                areaSquare > areaCircle? areaSquare > areaTriangle ? "square area bigger" : "triangle area bigger":
                        areaTriangle > areaCircle ?"triangle area bigger" : "circle area bigger");

        }
    }



