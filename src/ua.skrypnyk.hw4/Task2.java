package src.ua.skrypnyk.hw4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
    int[] array = new int[1000];
    fill(array);
    simpleNumber(array);
    counter (array);
    }
    private static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() *1000)+1);
        }
        System.out.println(Arrays.toString(array));
    }
    private static void simpleNumber(int[] array) {
        for (int i = 2; i <= array.length; i++) {
            boolean isPrime = true;

                if (i % 2 == 0 ) {
                    isPrime = false;
            }
            if (isPrime)
            {
                System.out.println (i );
            }
        }
    }
    private static void counter(int[] array) {
        int count = 0;
        for (int i = 2; i <= array.length; i++) {
            boolean isPrime = true;
            if (isPrime)
                count++;
        }
        System.out.println("Number all simple number in array "+ count);
    }
}