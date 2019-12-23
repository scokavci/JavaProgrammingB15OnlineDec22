package day13;

public class TestStringStartWithOrEndWith {
    public static void main(String[] args) {

        String name = "Muge";
        //check whether if a String starts with another String
        // its very case sensitive
        System.out.println(  name.startsWith("Mu"));
        System.out.println(  name.startsWith("mu"));
        System.out.println(  name.startsWith("Ma"));

        //check if a String end with another String

        System.out.println( name.endsWith("e"));
        System.out.println( name.endsWith("A"));
        System.out.println( name.endsWith("E"));

    }
}
