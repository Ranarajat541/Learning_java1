package Arrays;

public class Odd_even_in_arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                System.out.println("Even no:"+numbers[i]);
            } else if (numbers[i] % 2 !=0) {
                System.out.println("odd no:"+numbers[i]);

            }

        }
       /* System.out.println("\nOdd numbers in the array:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 !=0){
                System.out.println(numbers[i]);
            }
*/
            }
        }


