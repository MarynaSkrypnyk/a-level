package ua.skrypnyk.hw10;

public class Triangle extends Shapes {
    private double perimeter;
    private double area;
    public static int sideA = 15;
    public static int sideB = 20;
    public static int sideC = 18;

    public Triangle(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
   public void area() {
      areaTriangleForHeronFormula();
      areaTriangleForTwoSidesPerSineAngle();
      areaTriangleForBaseHeight();

      System.out.println("areaTriangleForHeronFormula " + areaTriangleForHeronFormula());
      System.out.println("areaTriangleForTwoSidesPerSineAngle "+ areaTriangleForTwoSidesPerSineAngle());
      System.out.println("areaTriangleForBaseHeight "+ areaTriangleForBaseHeight());
  }

   static double areaTriangleForHeronFormula() {
        double perimeter = (sideA + sideB + sideC)/(double)2;
        double heronFormula = Math.sqrt(perimeter * ((perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC)));
     return heronFormula;
   }
   static double areaTriangleForTwoSidesPerSineAngle (){
      double twoSidesPerSineAngles = 1/(double)2 * (sideA * sideB * Math.sin(45));
   return twoSidesPerSineAngles;
   }
   static double areaTriangleForBaseHeight (){
        double perimeter = (sideA + sideB + sideC)/(double)2;
        double height = 2/(double)sideC * Math.sqrt(perimeter * ((perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC)));
        double baseHeight = 1/(double)2 * (sideA * height);
    return baseHeight;
   }
}








