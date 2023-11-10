package src.ua.skrypnyk.hw4;

import java.util.Arrays;
//считает верно, но нужно в методе exchangeNul создать копию массива чтобы изначальный массив не изменился
//и вернуть этот массив из метода, вывести его в main
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[2000];
        fill(array);
        exchangeNull(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(exchangeNull(array)));
    }

    private static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 2000);
        }
    }

    private static int[] exchangeNull(int[] array) {
        int [] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < arrayCopy.length; i++) {
            if (arrayCopy[i] % 2 == 0) {
                arrayCopy[i] = 0;
            }
        }
        return arrayCopy;
    }
}
