package Arrays;

public class Arrays_pc1 {
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

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (number[i][j] > max){
                    max = number[i][j];
                }
                System.out.print(number[i][j]+ " ");

            }
            System.out.println();

        }
        System.out.println("largest number is :"+max);



    }
}
