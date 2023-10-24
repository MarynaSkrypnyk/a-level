package ua.skrypnyk.hw5;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        fill(array);
        exchangeArray (array);
    }
    private static void exchangeArray (int[][] array) {
        int[][] board = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                board[i][j] = array[j][i];

                System.out.print (board[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private static void fill(int[][] array) {
        array[0][0] = 1;
        array[0][1] = 2;

        array[1][0] = 9;
        array[1][1] = 4;

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

    }
}
