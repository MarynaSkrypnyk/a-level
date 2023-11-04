package src.ua.skrypnyk.hw10;

public class Main {

    public static void main(String[] args) {
        Shape square = new Square(15, 19);
        Shape circle = new Circle(20, 20);
        Shape triangle = new Triangle(20, 18);
//
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


        perimeterShape();
        whatShapeAreaBigger();
    }

    public static void perimeterShape () {
    Shape square = new Square(15, 19);
    Shape circle = new Circle(20, 20);
    Shape triangle = new Triangle(20, 18);

    square.perimeter();
    circle.perimeter();
    triangle.perimeter();
    }

    public static void whatShapeAreaBigger(){
        Shape square = new Square(15, 19);
        Shape circle = new Circle(20, 20);
        Shape triangle = new Triangle(20, 18);

        double areaSquare = square.getArea();
        double areaCircle = circle.getArea();
        double areaTriangle = triangle.getArea();


        if (areaSquare > areaCircle) {
            if (areaCircle > areaTriangle) {
                System.out.println("Area square is bigger than area circle and area triangle");
            }
        } else if (areaCircle > areaSquare) {
            if (areaSquare > areaTriangle) {
                System.out.println("Area circle is bigger than area square and area triangle ");
            }
        } else if (areaTriangle > areaSquare) {
            if (areaSquare > areaCircle) {
                System.out.println("Area triangle is bigger than area circle and area square");
            }
        }
        square.area();
        circle.area();
        triangle.area();
    }
}


