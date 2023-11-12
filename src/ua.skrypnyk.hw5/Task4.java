package src.ua.skrypnyk.hw5;
//таск4 удаляет верно
//метод remove вообще не нужен, можно удалить, все что нужно - делает removeElement
//ну и в main вывести то, что вернул removeElement

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int [] arr = {7, 5, 3, 3, 9, 8, 9};
        removeElement(arr,5);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(removeElement(arr, 5)));
    }

    private static int[] removeElement(int[] arr, int finalItem) {
    return Arrays.stream(arr)
                .filter(i -> i != finalItem)
                .toArray();
    }
}


