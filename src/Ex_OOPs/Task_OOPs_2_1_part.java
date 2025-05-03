package Ex_OOPs;

public class Task_OOPs_2_1_part {

        public static void main(String[] args) {
            Task1 s1 = new Task1();

            s1.intro();    //without parameter and without return type

            s1.person_name("Rajat");    // with parameter and without return type

            s1.person_age();
            System.out.println("Age is:"+s1.person_age());   //without parameter but with return type

            String de = s1.details("Rajat","Rana");
            System.out.println(de);       //with parameter and with return type


        }
    }



    class Task1{
        String name;
        int age;




        void intro(){
            System.out.println("Hello my name is rajat");   //without parameter and without return type
        }
        void person_name(String name1){
            System.out.println("Name is :"+name1);   // with parameter and without return type
        }
        public int person_age(){
            return 25;        //without parameter but with return type
        }
        public String details(String firstname, String lastname){
            return  "first name is:" +firstname+" lastname is:"+lastname;   //with parameter and with return type
        }


    }


