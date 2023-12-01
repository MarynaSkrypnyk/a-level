package src.ua.skrypnyk.hw13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator <Shape> perimeterShapesComparator = (Shape o1, Shape o2)  -> (int) (o1.perimeter()-o2.perimeter());
        Comparator <Shape> areaShapesComparator = (Shape o1, Shape o2)  -> (int) (o1.area()-o2.area());
        areaShapesComparator.thenComparing(perimeterShapesComparator);

        Set<Shape> shapes = new TreeSet<>(areaShapesComparator);

        Circle circl = new Circle(3);
        Triangle triangle = new Triangle(2,1,1,3.2);
        Square square = new Square(4);

        shapes.add(circl);
        shapes.add(triangle);
        shapes.add(square);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circl);
        shapeList.add(triangle);
        shapeList.add(square);

        Collections.sort(shapeList, perimeterShapesComparator);

        System.out.println(shapeList);
        System.out.println(shapes);
    }
}


