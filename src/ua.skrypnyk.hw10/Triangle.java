package src.ua.skrypnyk.hw10;

public class Triangle extends Shape {
    private double perimeter;
    private double area;
    int sideA;
    int sideB;
    int sideC;
    double height;
    double angle;

    public Triangle(int sideA, int sideB, int sideC,double height, double angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
        this.angle = angle;
    }

    @Override
    public double perimeter() {
        double perimeter = sideA + sideB + sideC;
       return perimeter;
    }

    @Override
    public double area() {
       area(sideA,sideB,sideC);
       area(sideA,sideB, angle);
       area(sideA,height);
        return area;
    }

    public Triangle(double area) {
        this.area = area;
    }

    public double area (int sideA, int sideB, int sideC) {
        double perimeter = (sideA + sideB + sideC) / (double) 2;
        return area  = Math.sqrt(perimeter * ((perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC)));
    }

    public double area (int sideA, int sideB, double angle) {
        return area = Math.sqrt(1/(double)2) * (sideA * sideB * Math.sin(angle));
    }

    public double area (int sideA, double height){
        return area = 1/(double)2 * (sideA * height);

   }
}








