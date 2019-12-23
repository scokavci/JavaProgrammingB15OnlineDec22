package day13;

public class MyName {
    public static void main(String[] args) {

        String myName = "Sumeyye";

        System.out.println( myName.equals("Sumeyye"));
        System.out.println( ! myName.equals("sumeyye"));
        System.out.println( myName.equalsIgnoreCase("sumeyye"));
        System.out.println( "My name is "+ myName.toUpperCase()  );
        System.out.println(  "My name is "+ myName.toLowerCase()  );
        System.out.println( "My name is "+ myName.length() );
        System.out.println(myName.startsWith("Sum"));
        System.out.println(myName.endsWith("yye"));

    }
}
