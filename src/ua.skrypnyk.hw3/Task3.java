package src.ua.skrypnyk.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        scannerWords();
    }

    public static void scannerWords() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a few words separated by spaces");
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (isValidWord(word)) {
                count++;
            }
        }
        System.out.println("You enter " + count+ " words");
    }

    static boolean isValidWord(String word) {
        char[] chars = word.toCharArray();
        for (char c : chars) {
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }
        return true;
    }
        }



