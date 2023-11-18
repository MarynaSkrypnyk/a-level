package src.ua.skrypnyk.hw12;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>(1);
        arrayList.add(2);

        System.out.println(arrayList);
        System.out.println(arrayList.isContains(1));

        ArrayList <Integer> arrayList1 = new ArrayList<>(3);
        arrayList1.indexOf(3);
        arrayList1.indexOf(4);

        ArrayList <Integer> arrayList2 = new ArrayList<>(1);
        arrayList2.add(2,0);
        System.out.println(arrayList2);

    }
}
