package javaprogramme;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the
 * user and print the sum of those numbers.
 * -Use the hasNextInt() method from the scanner to check
 * if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number.
 * Continue reading until you have read 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number
 * #x: where x represents the count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number
 * #1:, the next Enter number #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */


public class ReadingUserInputChallenge1 {
    public static void main(String[] args) {
        //scanner input fir the user
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        //while loop using
        while (count < 10) {
            int order = count + 1;
            System.out.println("Enter number #" + order + " : ");
            //if else method input
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number.Please enter a valid integer.");
            }
            //the newline charcter consume after reading the integer
            scanner.nextLine();
        }
        //scanner close
        scanner.close();
        System.out.println("The sum of the 10 numbers is: " + sum);
    }


}
