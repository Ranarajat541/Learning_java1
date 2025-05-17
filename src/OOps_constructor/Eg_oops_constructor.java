package OOps_constructor;

public class Eg_oops_constructor {
    public static void main(String[] args) {

        Baby b1 = new Baby();
        b1.cry();
        new Baby();


    }



}


class Baby {

// Attribute | Instance Variable |  Member variables, data members

    String name;



void cry(){

    System.out.println("cry!!");
}

void sleep(){

    System.out.println("sleep");
}

// Default Constructor!
Baby() {
    System.out.println("I am called, Default Constructor!");
    // Fetch data from the MySQL database...
    // Read from CSV File , XLSX
    // Open a file and read the data. (json, testdata.xlsx, txt file)

}
}



