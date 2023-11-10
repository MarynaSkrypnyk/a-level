
package src.ua.skrypnyk.hw2;

import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number: ");
            int num = input.nextInt();
            System.out.println(evenOrOddNumber(num));
        }

        private static String evenOrOddNumber(int num) {
            if (num %2 == 0)
                return "Number even";
            else
                return "Number odd";

        }


}
