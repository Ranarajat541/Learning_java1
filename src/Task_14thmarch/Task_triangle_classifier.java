package Task_14thmarch;

import java.util.Scanner;

public class Task_triangle_classifier {
    public static void main(String[] args) {
        // Triangle Classifier:
        //
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),

        // or scalene (no sides are equal). Use an if-else statement to classify the triangle.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three sides of triangle:");

        System.out.println("Enter the first side:");
        int a = scanner.nextInt();
        System.out.println("Enter the second side:");
        int b = scanner.nextInt();
        System.out.println("Enter the third side:");
        int c = scanner.nextInt();

        if (a==b && b==c){
            System.out.println("equilateral");


        }
        else if(a==b || b==c || c==a){
            System.out.println("isosceles");
        }
        else {
            System.out.println("scalene (no sides are equal)");
        }
        scanner.close();

    }
}
