package ua.skrypnyk.hw2;

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
        if ((Math.abs(d)) < (Math.abs(f)) && (Math.abs(d)) < (Math.abs(g))) {
            System.out.println ("Number smaller in modulus " + Math.abs(d));
        } else if ((Math.abs(f)) < (Math.abs(d)) && (Math.abs(f)) < (Math.abs(g))) {
            System.out.println ("Number smaller in modulus " + Math.abs(f));
        } else {
            System.out.println("Number smaller in modulus " + Math.abs(g));
        }
    }
}
