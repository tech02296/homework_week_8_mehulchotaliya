package javaprogramme;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 *Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class TriangleWithNumber6 {
    public static void main(String[] args) {
        //scanner input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();//scanner close

        for (int i = 1; i <= rows; i++) {//for loop using
            for (int j = 1; j <= i; j++) {
                System.out.print(j);//variable calling
            }
            System.out.println();


        }

    }
}





