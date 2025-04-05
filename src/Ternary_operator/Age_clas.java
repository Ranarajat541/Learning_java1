package Ternary_operator;

public class Age_clas {
    public static void main(String[] args) {
        String age1 = args[0];  //input in CLI
        System.out.println(age1);

        int age = Integer.parseInt(age1); //insert age into int type variable
         String result = (age<18)? "minor" :(age<65) ? "adult" : "senior";
        System.out.println(result);
    }
}
