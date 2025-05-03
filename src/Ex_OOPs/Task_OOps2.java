package Ex_OOPs;

public class Task_OOps2 {
    public static void main(String[] args) {
        Task s1 = new Task();

        s1.intro();    //without parameter and without return type

         s1.person_name("Rajat");    // with parameter and without return type



        s1.set_age(25);
        System.out.println("Age is:"+s1.person_age());   //without parameter but with return type



        String de = s1.details("Rajat","Rana");
        System.out.println(de);       //with parameter and with return type


    }
}



    class Task{
        String name;    //use this class under the name
        int age;    // use this for age




        void intro(){
            System.out.println("Hello my name is rajat");   //without parameter and without return type
        }
        void person_name(String name1){
            name = name1;
            System.out.println("Name is :"+name);   // with parameter and without return type
        }





        public int person_age(){
            return age;         //without parameter but with return type
        }
        public void set_age(int a) {
            age = a;                   // use for set the age
        }





        public String details(String firstname, String lastname){
            return  "first name is:" +firstname+" lastname is:"+lastname;   //with parameter and with return type
        }


    }

