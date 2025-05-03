package Star_patterns;

public class Right_angled_triangle_decreasing {

    public static void main(String[] args) {


        int n = 5;


        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >=i ; j--) {
                System.out.print("*");


            }
            System.out.println();


/*
            int n = 5;

            for (int i = n; i >= 1; i--) {           // Rows from n to 1
                for (int j = 1; j <= i; j++) {       // Stars = row number
                    System.out.print("*");
                }
                System.out.println();                // Move to next row
            }
*/

        }
    }
}
