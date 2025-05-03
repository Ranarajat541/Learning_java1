package Star_patterns;

public class Pc4 {

            public static void main(String[] args) {


                int n = 5;


                for (int i = 1; i <= n ; i++) {        //rows from n to 1
                    for (int j = n; j >=i ; j--) {
                        System.out.print("*");

                    }

                    System.out.println();

                }
            }
        }

