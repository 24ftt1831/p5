package Practical5;

import java.util.Scanner;

public class WordComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = input.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = input.nextLine();

        String choice = word1.equalsIgnoreCase(word2) ? "true" : "false";
        System.out.println("Are the two words identical? " + choice);
        
        input.close();

    }
}
