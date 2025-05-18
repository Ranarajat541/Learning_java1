package Multilevel_Inheritance;

public class Dynamic_dispatch {

        public static void main(String[] args) {


//        Son s1 = new GrandFather();
//        Son s1 = new Father();
            son amit = new son();

            Grandfather g1 = new son(); // Dynamic Dispatch
            g1.gf();
            g1.home();  // son's property



            Grandfather g2 = new Father();
            g2.home();


            Father f2 = new son();
            f2.home();
            // Father f3 = new GrandFather();

            // WebDriver driver = new ChromeDriver();






        }
    }

