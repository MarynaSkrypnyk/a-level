package src.ua.skrypnyk.hw4;

import java.util.Arrays;

import static java.lang.Math.pow;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        fill(array);
        average(array);
        geometricMean(array);

        System.out.println(Arrays.toString(array));
        System.out.println("Average = " + average(array));
        System.out.println("GeometricMean = " + geometricMean(array));
    }
    private static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() *10)+1);
        }
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    private static double geometricMean(int[] array) {
        double multiplication = 1;
        for (int j : array) {
            multiplication = multiplication * j;
        }
        return pow (multiplication, 1.0 / array.length);
    }
}


