package day15;

public class StringCaseInsensitiveCheck {
    public static void main(String[] args) {

        String name = "Arya Stark";
        System.out.println( " name.contains st RESULT IS : " +  name.contains("st") );

        //I want to check whether this name contains "st" no matter the case
        // so I want to store the uppercase version of this name then check for "ST"

        String uppercaseName = name.toUpperCase();    //"ARYA STARK "
        System.out.println("uppercaseName contains  ST or not ? " +uppercaseName.contains("ST")    );

        String lowercaseName = name.toLowerCase();    //"arya stark "
        System.out.println("uppercaseName contains  st or not ? " +uppercaseName.contains("st")    );

        // THIS IS CALLED METHOD CHAINING , combining multiple method call
        // make my name all lowercase(String) then check whether it contains lowercase st
                                       // result string     // st is also string // both same type
        System.out.println(    name.toLowerCase().contains("st")  );
                           // number is primitive so int can not functionality of uppercase of number
        // System.out.println(  name.length() .toUpperCase);  // this does not work. different data types





    }
}
