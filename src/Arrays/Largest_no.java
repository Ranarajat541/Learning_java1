package Arrays;

import java.util.Arrays;

public class Largest_no {
    public static void main(String[] args) {
        int[] numbers = {23,55,66,88};
        int largest = numbers[0];


        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];

            }
        }
        System.out.println(largest);





    }

    }


