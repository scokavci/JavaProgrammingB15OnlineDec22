package day20;

public class PalindromeTest {
    public static void main(String[] args) {

        // if you reverse a String it does not change
        // it means the string is called Palindrome

        // level , kayak ,elle, madam , aziza
        String name = "Nurses run";
        System.out.println("name = " + name);
        String reversedName ="";

        for (int x = name.length()-1; x >=0 ; x--) {
            reversedName = reversedName + name.charAt(x);
        }
        System.out.println("reversedName = " + reversedName);
        // check whether reserved name is equal without case checking
        if ( name.equalsIgnoreCase(reversedName)){
            System.out.println("PALINDROME TEST HAS PASSED");
        }else {
            System.out.println("PALINDROME TEST HAS FAILED");
        }

        // make this code does not care about spaces while checking
        // replace

    }
}
