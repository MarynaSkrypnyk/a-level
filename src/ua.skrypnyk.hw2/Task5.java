package src.ua.skrypnyk.hw2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int num;
        int reverse = 0;
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        while(num != 0)
        {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        System.out.println("Reversed Number: " + reverse);
    }
}
