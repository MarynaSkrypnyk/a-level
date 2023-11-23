package src.ua.skrypnyk.hw13;

import java.util.Comparator;

    public class AreaShapesComparator implements Comparator<Shape> {
        @Override
        public int compare(Shape o1, Shape o2) {
            return (int) (o1.area()-o2.area());
        }
    }

