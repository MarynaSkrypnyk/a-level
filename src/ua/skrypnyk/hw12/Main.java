package src.ua.skrypnyk.hw12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>(3);

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);

        arrayList.add(18,3);
        System.out.println(arrayList);

        System.out.println(arrayList.indexOf(14));

        System.out.println(arrayList.isContains(8));
    }
}
