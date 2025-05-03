package Arrays;

import java.util.Scanner;

public class Trianglepc1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows where you want to print the stars");
        int number = scanner.nextInt();


        for (int i = number; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
