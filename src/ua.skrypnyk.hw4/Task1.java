package ua.skrypnyk.hw4;

import java.util.Arrays;

import static java.lang.Math.pow;


public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        fill(array);
        average(array);
        geometricMean(array);
    }
    private static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() *10)+1);
        }
        System.out.println(Arrays.toString(array));

    }

    public static void average(int[] array) {
        int sum = 0;
        double average = 0;
        for (int num : array) {
            sum += num;
            average = (double) sum / array.length;
        }
        System.out.println("Sum all numbers of array "+ sum);
        System.out.println("Avarage array "+ average);
    }
    private static void geometricMean(int[] array) {
        int multiplication = 1;
        double geometric = 0;

        for (int i = 0; i < array.length; i++) {
        multiplication = multiplication * array[i];
        geometric = (double) pow  (multiplication, 1.0 % array.length);

        }
        System.out.println("Multiplicator all numbers of array "+ multiplication);
        System.out.println(geometric);


    }
}


