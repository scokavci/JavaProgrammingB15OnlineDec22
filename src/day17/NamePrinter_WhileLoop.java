package day17;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {

        String name = "call 1-800-Alexander";

        //get each and every character and print them out vertically
        int x = 0;
        // from index 0 till last index (   name.length() - 1  )

        while( x < name.length() ) {   // x <= name.length()-1
            System.out.print("index = " + x + " : ");
            System.out.println( name.charAt(x));
            ++ x;
        }
    }
}
