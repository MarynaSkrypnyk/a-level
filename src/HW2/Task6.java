package HW2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int num;
        int reverse = 0;
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        for( ;num != 0; num=num/10)
        {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("Reversed Number: "+ reverse);
    }
}

