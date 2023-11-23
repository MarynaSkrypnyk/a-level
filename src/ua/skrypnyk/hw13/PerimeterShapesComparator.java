package src.ua.skrypnyk.hw13;

import java.util.Comparator;

    public class PerimeterShapesComparator implements Comparator <Shape> {

        @Override
        public int compare(Shape o1, Shape o2) {
            return (int) (o1.perimeter()-o2.perimeter());
        }
    }

