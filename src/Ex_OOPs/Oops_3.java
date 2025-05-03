package Ex_OOPs;

public class Oops_3 {



        public static void main(String[] args) {

            Student s1 = new Student();
            s1.name = "Rajat";
            System.out.println(s1.name);

            Student s2 = new Student();
            s2.roll = 1234;
            System.out.println(s2.roll);
            //1. Student - Class Loading
            //2. s1 - Object Ref.
            //3. new Student() -> Object creation



        }
    }

    class Student{
        String name;
        int roll;

        void sleep(){}



    }

