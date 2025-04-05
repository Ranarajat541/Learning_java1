package Type_casting;

public class narrowing_Type_casting {
    public static void main(String[] args) {
        int a = 300; //value converted into  binary first and byte takes 8 bit only so answer is 44
       // byte b = a;  //Invalid  because of overflow - imlicit casting is not allowed
        byte b = (byte)a; //valid explicit casting is allowed in this narrowing case //data loss
        System.out.println(b);
    }
}
