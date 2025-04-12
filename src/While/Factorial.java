package While;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("Enter the factorial number:");
        int number = scanner.nextInt();



        int factorial = 1;
        if (number <= 0) {
            System.out.println(factorial);


        } else {
            for (int i = 1; i <= number; i++){
                factorial = factorial * i;

            }
            System.out.println("Factorial of " + number + " is: " + factorial);


        }
        //scanner.close();
    }
}
}


