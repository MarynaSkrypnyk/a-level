package ua.skrypnyk.hw2;

public class Task2 {
    public static void main(String[] args) {
        double x1 = 1.0;
        double x2 = 3.0;
        double x3 = 6.0;
        double y1 = 5.0;
        double y2 = 5.0;
        double y3 = 7.0;

        double lenghtA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double lenghtB = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double lenghtC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double perimeter = lenghtA + lenghtB + lenghtC;
        double perimeterHalf = perimeter / 2.0;
        double square = Math.sqrt(perimeterHalf * (perimeterHalf - lenghtA) * (perimeterHalf - lenghtB) * (perimeterHalf - lenghtC));


        System.out.println("Square triangle " + square);
    }
}
