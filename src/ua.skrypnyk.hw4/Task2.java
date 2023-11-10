package src.ua.skrypnyk.hw4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[1000];

        fillArray(array);
        howMuchSimpleNumberInArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Amount simple number in array " + howMuchSimpleNumberInArray(array));
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 1000) + 1);
        }
    }

    // count simple number
    private static int howMuchSimpleNumberInArray(int[] array) {
        int count = 0;
        for (int i = 2; i <= array.length; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }
}


