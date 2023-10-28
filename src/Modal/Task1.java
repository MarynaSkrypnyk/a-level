package Modal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        int [] array = new int [9];
        fill(array);
        search(array);
    }
    private static void search(int[] array) {
        Set<Integer> mySet = new HashSet<>();
        for (int number : array) {
            mySet.add(number);
        }
        System.out.println(mySet.size());
    }
    private static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() *10)+1);
        }
        System.out.println(Arrays.toString(array));
    }
}
