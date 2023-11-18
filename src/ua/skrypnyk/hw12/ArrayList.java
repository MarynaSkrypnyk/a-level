package src.ua.skrypnyk.hw12;

import java.util.Arrays;
import java.util.List;

public class ArrayList<T> {
    private Object[] array;
    private int size;

    @Override
    public String toString() {
        return Arrays.asList(array).toString();
    }

    ArrayList(int size) {
        this.size = size;
        array = new Object[size];
    }

    //Add element to the end of array {1,2,3} -> {1,2,3,4}
    void add(T element) {
        array = new Object[array.length + 1];
        array[array.length - 1] = element;
    }

    //    Add element to given position of array {1,2,3} -> {1,4,2,3}
    void add(T element, int index) {
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
    }

    //    Returns index of the given element, if element doesnt exist return -1 -> (HERE MISTAKE)
    void indexOf(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }

    boolean isContains(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}
