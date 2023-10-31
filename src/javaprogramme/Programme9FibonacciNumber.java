package javaprogramme;

import java.util.Scanner;

/**
 * . Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Programme9FibonacciNumber {
    public static void main(String[] args) {
        int count;
        int num1 = 0;
        int num2 = 1;
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        System.out.println("Fibonacci Series of "+count+" numbers: ");
        int i=1;
        while(i<=count)
        {
            System.out.println(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }

    }

}
