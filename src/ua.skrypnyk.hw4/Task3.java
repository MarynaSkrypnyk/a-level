package ua.skrypnyk.hw4;

import java.util.Arrays;

public class Task3 {
        public static void main(String[] args) {
            int[] array = new int[2000];
            fill(array);
            exchangeNul (array);
        }
    private static void fill(int[] array) {
      for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random()*2000);
      }
      System.out.println(Arrays.toString(array));
      }

    private static void exchangeNul(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    array[i] = 0;
                }
            }
            System.out.println(Arrays.toString(array));
        }

}
