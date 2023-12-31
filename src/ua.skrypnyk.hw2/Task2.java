package src.ua.skrypnyk.hw2;

public class Task2 {
    public static void main(String[] args) {
        double x1 = 1.0;
        double x2 = 3.0;
        double x3 = 6.0;
        double y1 = 5.0;
        double y2 = 5.0;
        double y3 = 7.0;

        calculationSquareTriangle(x1, x2, x3, y1, y2,y3);
        System.out.println();
    }

    private static void calculationSquareTriangle (double x1,double x2, double x3, double y1, double y2, double y3){

    double lenghtA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    double lenghtB = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    double lenghtC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

    double perimeter = lenghtA + lenghtB + lenghtC;
    double perimeterHalf = perimeter / 2.0;
    double squareTriangle = Math.sqrt(perimeterHalf * (perimeterHalf - lenghtA) * (perimeterHalf - lenghtB) * (perimeterHalf - lenghtC));

        System.out.println(squareTriangle);

    }
}
