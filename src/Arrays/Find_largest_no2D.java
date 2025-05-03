package Arrays;

public class Find_largest_no2D {
    public static void main(String[] args) {
        int [][] number = {{2,3,4},{5,6,7},{8,9,10}};



        for (int i = 0; i <number.length ; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]+" ");

                }
            System.out.println();
            }
          //find the largest no of array

        int max = number[0][0];

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (number[i][j] > max) {
                    max = number[i][j];

                }
            }
        }
        System.out.println(max);

            }

        }



