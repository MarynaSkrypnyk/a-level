
package src.ua.skrypnyk.hw2;

import java.util.Scanner;

public class Task3 {

    public static int num;
    public static void main(String[] args) {
        scannerNumber();
        evenOrOddNumber();
    }

    private static void scannerNumber() {
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
    }

    private static void evenOrOddNumber() {
        if (num %2 == 0)
            System.out.println("Number even");
        else
            System.out.println("Number odd");
    }

}
