package src.ua.skrypnyk.hw5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{3,4}};
        exchangeArray(array);

        System.out.println(Arrays.deepToString(array));
        System.out.print(Arrays.deepToString(exchangeArray(array)));

    }
    public static int[][] exchangeArray (int[][] array) {
        int[][] board = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                board[i][j] = array[j][i];

            }
        }
        return board;
    }

}
