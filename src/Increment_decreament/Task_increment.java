package Increment_decreament;

public class Task_increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        // 11 + 12 + 13
        // addition will be  11 + 11 + 12  = 34

        System.out.println(a);
        //a = 13

    }
}
