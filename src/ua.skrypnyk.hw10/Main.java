package ua.skrypnyk.hw10;

public class Main {

    public static void main(String[] args) {

        Shapes square = new Square(15, 19);
        Shapes circle = new Circle(20, 20);
        Shapes triangle = new Triangle(20, 18);

        double perimeterSquare = square.getPerimeter();
        double perimeterCircle = circle.getPerimeter();
        double perimeterTriangle = triangle.getPerimeter();

        System.out.println(perimeterSquare);
        System.out.println(perimeterCircle);
        System.out.println(perimeterTriangle);


        double areaTriangle = triangle.getArea();
        double areaCircle = circle.getArea();
        double areaSquare = square.getArea();

        System.out.println(areaTriangle);
        System.out.println(areaCircle);
        System.out.println(areaSquare);

        triangle.area();

        if (areaTriangle > areaCircle) {
            if (areaCircle > areaSquare) {
                System.out.println("Area triangle is bigger");
            }
        } else if (areaCircle > areaSquare) {
            if (areaSquare > areaTriangle) {
                System.out.println("Area circle is bigger");
            }
        } else if (areaSquare > areaTriangle) {
            if (areaTriangle > areaCircle) {
                System.out.println("Area square is bigger");
            }
        }
    }
}


