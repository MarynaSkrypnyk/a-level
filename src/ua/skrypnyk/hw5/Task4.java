package ua.skrypnyk.hw5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int [] arr = {7, 5, 3, 3, 9, 8, 9};
        int item = 0;
        removeElement(arr, item);
        remove (arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void remove(int[] arr) {
        int item = 5;
        arr = removeElement(arr, item);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
}


