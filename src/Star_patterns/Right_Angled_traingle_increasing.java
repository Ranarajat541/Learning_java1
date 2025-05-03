package Star_patterns;

public class Right_Angled_traingle_increasing {
    public static void main(String[] args) {



      /*  ✅ How it works:
        Row 1 → 1 star

        Row 2 → 2 stars

        Row 3 → 3 stars

…

        Loop prints i stars in row i   */

        int n = 5;


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
