package Multilevel_Inheritance;

public class Executed_mulitlevel {
    public static void main(String[] args) {


        Grandfather gf = new Grandfather();
        gf.gf();

        System.out.println("----------------------");

        Father f = new Father();
        f.f();
        f.gf();

        System.out.println("----------------------");

        son s = new son();
        s.s();
        s.f();
        s.gf();


    }


}
