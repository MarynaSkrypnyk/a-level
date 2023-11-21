package src.ua.skrypnyk.hw12;

import java.util.Arrays;

public class ArrayList<T> {
    private Object[] array;
    private int size;
    int count = 0;

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
        array[count++] = element;
        Object[] destarray = ((T[]) Arrays.copyOf(array, array.length + 1));
        destarray [array.length] = element;
        array = destarray;
    }

    void add(T element, int index) {
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
    }

    int indexOf(T element) {
        for (int index = 0; index < array.length; index++) {
            if (element == array[index]) {
                return index;

            }
        }
        return -1;
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
