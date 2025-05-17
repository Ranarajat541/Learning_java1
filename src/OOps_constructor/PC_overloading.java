package OOps_constructor;

public class PC_overloading {

        public static void main(String[] args) {

            //Constructor overloading allows a class to have multiple constructors with different parameter lists.
            // This enables different ways to create an object of the same class.

            Person p1 = new Person("AMIT",97654321,"abc");
            Person p2 = new Person("PRAMOD",98989898,"XYZ");

            Person p3  = new Person();
            p3.name = "Shikha";
            System.out.println(p3.name);

            Person p4 = new Person("LUCKY",823424242);
            System.out.println(p4.address);


            p1.eat();
            p2.eat();
            p3.eat();
            p4.eat();
        }
    }


    class Person{

        String name;
        long phone;
        String address;

        Person(){

        }

        Person(String name_arg,long phone_arg, String address_arg){
            this.name = name_arg;
            this.address = address_arg;
            this.phone = phone_arg;

        }

        Person(String name_arg,long phone_arg){
            this.name = name_arg;
            this.phone = phone_arg;

        }

        void eat(){
            System.out.println(this.name + " is eating!");
        }


    }

