package Switch_case;

import com.sun.source.tree.CaseTree;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Lab_Switch_case {
    public static void main(String[] args) {

        //Switch

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");
        int day = scanner.nextInt();

        switch (day)

        {
            case 1:
            System.out.println("Mon");
            break;
            case 2:
            System.out.println("Tue");
            break;
            case 3:
            System.out.println("wed");
            break;
            case 4:
            System.out.println("Thu");
            break;
            case 5:
            System.out.println("fri");
            break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("invalid date");
                break;

        }
    }

}
