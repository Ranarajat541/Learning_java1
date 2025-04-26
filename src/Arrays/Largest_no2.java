package Arrays;

public class Largest_no2 {

        public static void main(String[] args) {
            int[] numbers = {45, 22, 89, 67, 12, 99, 34}; // Example array
            int largest = numbers[0];

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }

            System.out.println("The largest number in the array is: " + largest);
        }
    }


