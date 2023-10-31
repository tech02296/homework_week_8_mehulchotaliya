package javaprogramme;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the
 * minimum and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number,
 * break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class MinAndMaxInputChallenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //using while loop method
        while (true) {
            System.out.println("Enter Number: ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num < max) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            } else {
                //If user enters invalid number,break out of the lopp
                break;
            }
        }
        System.out.println("Minimun number: " + min);
        System.out.println("Maximum number: " + max);
        scanner.close();

    }
}
