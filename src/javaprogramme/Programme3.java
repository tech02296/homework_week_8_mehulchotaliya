package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input.
 * If the user input Is not a letter (between a and z or A and Z),
 * or is a string of length > 1, print an error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an Alphabet : ");
        String input = scanner.next();
        //Cheack if the input is single character
        if (input.length() == 1) {
            char character = input.charAt(0);
            //cheack if input is a letter
            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'z')) {
                char lowercaseChar = Character.toLowerCase(character);
                //cheack if the letter is a vowel
                if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' || lowercaseChar == 'o' || lowercaseChar == 'u') {
                    System.out.println("Input letter is Vowel: ");
                } else {
                    System.out.println("Input letter is Consonant: ");
                }
            } else {
                System.out.println("Invalid input. Enter a letter (a to z or A to Z");

            }
        } else {
            System.out.println("Invalid input. Enter a single character. ");

        }
        scanner.close();

    }
}






