package src.ua.skrypnyk.hw5;

import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{4,5},{6,7,8,9,10,},{11,12,13},{14,15},{16,17,18}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
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
}

