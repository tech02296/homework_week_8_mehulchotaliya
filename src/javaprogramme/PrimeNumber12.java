package javaprogramme;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only.
 * In other words, prime numbers can't be divided by other numbers than
 * itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
 */

public class PrimeNumber12 {
    public static void main(String[] args) {
        //scanner input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        //if else method
        if (isPrime(number)) {
            System.out.println(number + "is a prime number. ");
        } else {
            System.out.println(number + "is not a prime number. ");
        }
        //scanner close
        scanner.close();
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        //for loop
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
