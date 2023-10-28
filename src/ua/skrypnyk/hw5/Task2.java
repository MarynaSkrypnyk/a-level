package ua.skrypnyk.hw5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[20];
        fill(array);
        isSorted(array);
    }

    private static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 20) + 1);
        }
        System.out.println(Arrays.toString(array));
    }

    private static boolean isSorted(int[] array) {
        boolean sort = true;
        for (int i = 0; i < array.length; i++) {
                if (array[i] < array[i + 1]) {
                    sort = false;
                    break;
            }
        }

        System.out.println(sort);
        return true;
    }
}