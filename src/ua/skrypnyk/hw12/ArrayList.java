package src.ua.skrypnyk.hw12;

import java.util.Arrays;
public class ArrayList<T> {
    private Object[] array;
    private int size;

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
    ArrayList(int size) {
        this.size = size;
        array = new Object[]{size};
    }
    //
    //Add element to the end of array {1,2,3} -> {1,2,3,4}
    void add(T element) {
        T[] destArray = (T[]) Arrays.copyOf(array, array.length + 1);
        destArray[destArray.length - 1] = element;
        array = destArray;
    }

    //Add element to given position of array {1,2,3} -> {1,4,2,3} => => (HERE NEED HELP!!!!)
    void add(T element, int index) {
        T[] destArray = (T[]) Arrays.copyOf(array, array.length + 1);
        destArray[index] = element;
        T t = destArray[destArray.length - 1];
        array = destArray;
    }
    //Returns index of the given element, if element doesnt exist return -1
    void indexOf(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("Index of element " + element + "= " + i);
            } else
                System.out.println(-1);
        }
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