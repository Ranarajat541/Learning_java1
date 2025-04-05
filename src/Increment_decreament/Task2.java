package Increment_decreament;

public class Task2 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        // 19 + 20 + 19
        // value will take for addition --> 19 + 19 + 20  = 58
        System.out.println(a);
        // a value will be  = 19 last decrement

    }
}
