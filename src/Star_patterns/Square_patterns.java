package Star_patterns;

public class Square_patterns {
    public static void main(String[] args) {



      /*  ✅ How it works:
        Outer loop (i) runs n times → creates n rows

        Inner loop (j) also runs n times → prints n stars per row

        Every time inner loop finishes, a new line is printed  */

        int n = 5;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");

            }
            System.out.println();


        }
    }
}
