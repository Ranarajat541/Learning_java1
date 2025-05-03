package Arrays;

public class Arraypc3_reverese_lastcolumnfirst {
    public static void main(String[] args) {
        int [][] number = new int[3][3];
        number[0][0] = 1;
        number[0][1] = 2;
        number[0][2] = 3;

        number[1][0] = 10;
        number[1][1] = 15;
        number[1][2] = 20;

        number[2][0] = 30;
        number[2][1] = 40;
        number[2][2] = 50;


        int max = number[0][0];

        // Traverse in reverse order: rows from bottom to top, columns from right to left

        for (int i = number.length-1; i >=0; i--) {
            for (int j = number[i].length-1; j >=0; j--) {
                if (number[i][j] > max){
                    max = number[i][j];
                }
                System.out.print(number[i][j]+ " ");

            }
            System.out.println();

        }
        System.out.println("largest number is :"+max);
        //  System.out.println(number.length);



    }
}



