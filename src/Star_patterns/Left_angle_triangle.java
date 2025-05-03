package Star_patterns;

public class Left_angle_triangle {
    public static void main(String[] args) {


        int n = 5;


        for (int i =1 ; i <=n ; i++) {
            for (int j = 1; j <=n - i ; j++) {
                System.out.print(" ");  /*  Why use " " inside System.out.print() if the loop is already for spaces?
                        Because:The loop itself doesn’t add space — it just controls how many times we run the print statement.
                           We must explicitly tell Java to print a " " (space character) each time.*/

            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
