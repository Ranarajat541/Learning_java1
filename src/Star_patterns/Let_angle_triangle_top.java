package Star_patterns;

public class Let_angle_triangle_top {
    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i >=1 ; i--) {
              for (int j = i+1; j <=n ; j++) {
                 System.out.print(" ");

        }
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
