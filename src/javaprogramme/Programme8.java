package javaprogramme;
/*
* . Display right angle triangle of @ using nested for loops

 */

public class Programme8 {
    public static void main(String[] args) {

        System.out.println("Displaying a right triangle of @: ");
// Outer for loop.
        for (int i = 1; i <= 5; i++) {
            // Inner for loop.
            for (int j = 1; j <= i; j++) {
                System.out.print("@" + " ");
            }
            System.out.println(" ");
        }

    }
}
