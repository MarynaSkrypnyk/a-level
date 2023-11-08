package src.ua.skrypnyk.hw2;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d;
        int f;
        int g;
        System.out.println("Enter first number: ");
        d = sc.nextInt();
        System.out.println("Enter second number: ");
        f = sc.nextInt();
        System.out.println("Enter third number: ");
        g = sc.nextInt();

        System.out.println(Math.abs(d) > Math.abs(g)? Math.abs(d) > Math.abs(f) ? "Fist number bigger" : "Third number bigger": Math.abs(f) > Math.abs(g) ?"Second number bigger" : "Third number bigger");
    }
}
