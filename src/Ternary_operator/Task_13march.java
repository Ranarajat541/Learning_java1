package Ternary_operator;

public class Task_13march {
    public static void main(String[] args) {
        String grade1 = args[0];
        System.out.println(grade1);

        int grade = Integer.parseInt(grade1);
        String result = (grade >= 90) ? "A" : (grade >= 80) ? "B" : (grade >= 70) ? "C" : (grade >= 60) ? "D" : "F";
        System.out.println(result
        );
    }
}
