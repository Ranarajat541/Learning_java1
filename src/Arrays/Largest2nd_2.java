package Arrays;

public class Largest2nd_2 {

        public static void main(String[] args) {
            int[] arr = {75, 10, 50,100, 30, 70,80};

            int largest = arr[0];
           int secondLargest = Integer.MIN_VALUE;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];

                }
            }

            System.out.println("Largest number = " + largest);
           System.out.println("Second largest number = " + secondLargest);
        }
    }


