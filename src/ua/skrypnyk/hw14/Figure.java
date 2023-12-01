package src.ua.skrypnyk.hw14;

import java.util.*;
import java.util.stream.Collectors;

public class Figure {
    public static void main(String[] args) {
        ArrayList<Circle> circleArrayList = fillArrayList(new ArrayList<>());
        System.out.println(circleArrayList);
        areaBiggerThanMinimum(circleArrayList);
        areaBiggerThanPerimeter (circleArrayList);
    }

    public static ArrayList<Circle> fillArrayList  (ArrayList<Circle> circleArrayList){
        Circle circle = new Circle(10,10);
        Circle circle1 = new Circle(20,15);
        Circle circle2 = new Circle(30,15);

        circleArrayList.add(circle);
        circleArrayList.add(circle1);
        circleArrayList.add(circle2);

        return circleArrayList;
    }
    public static void areaBiggerThanMinimum (ArrayList<Circle> circleArrayList) {
        Optional<Double> result = circleArrayList.stream()
                .map(circle3 -> circle3.area())
                .min(Double::compareTo);

        List<Circle> resultList = circleArrayList.stream()
                .filter(circle3 -> circle3.area() - result.get() == findFigure(10))
                .collect(Collectors.toList());

        System.out.println("area bigger than minimum "+resultList);
    }
    public static void areaBiggerThanPerimeter (ArrayList<Circle> circleArrayList) {
        List<Circle> areaBiggerThanPerimeter = circleArrayList.stream()
                .filter(circle3 -> circle3.area() / circle3.perimeter() == 2)
                .collect(Collectors.toList());

        System.out.println("area two times bigger than perimeter "+ areaBiggerThanPerimeter);
    }
    private static double findFigure(double difference){
        return difference;
    }
}
