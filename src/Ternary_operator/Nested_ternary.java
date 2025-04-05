package Ternary_operator;

public class Nested_ternary {
    public static void main(String[] args) {
        int number = 25;
        String result = (number>10)?(number>20?"N>20" : "N<20"):"B";
        System.out.println(result);

    }
}
