package src.ua.skrypnyk.hw12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>(3);

        arrayList.add(4);
        System.out.println(arrayList);

        arrayList.add(18,2);
        System.out.println(arrayList);

        arrayList.indexOf(18);

        System.out.println(arrayList.isContains(18));
    }
}
