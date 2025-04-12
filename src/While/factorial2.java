package While;

import java.util.Scanner;

public class factorial2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number to find its factorial (or -1 to exit):");
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Exiting program. Goodbye!");
                break; // end the loop
            }

            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                continue; // skip to next input
            }

            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);

            // No need for 'continue' here — it will automatically go back to the start of the loop
        }

        scanner.close();
    }
}
