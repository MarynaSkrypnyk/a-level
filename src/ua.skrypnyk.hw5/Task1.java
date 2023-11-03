package src.ua.skrypnyk.hw5;

import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {
        int [] [] array = new int[4][3];
        fill(array);
        negativeNumbers(array);
    }
    private static void negativeNumbers(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 != 0)
                    array[i][j] = -1 * array [i][j];
            }
                System.out.println();
                System.out.print(Arrays.toString(array [i]));
            }
        }
    private static void fill(int[][] array) {

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

        array[3][0] = 10;
        array[3][1] = 11;
        array[3][2] = 12;

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
}
}

