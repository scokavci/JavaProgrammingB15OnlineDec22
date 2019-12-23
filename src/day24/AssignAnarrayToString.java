package day24;

import java.util.Arrays;

public class AssignAnarrayToString {
    public static void main(String[] args) {

        // create a double array of 3 items ; and put 3 value
        // get a string representation out of this array and save it as priceString
        // print each and every character in this string in this format
        // character at index 1 is: yourcharacterHere
        // character at index 2 is: yourcharacterHere and so on all the way till last

        double[] prices = {5.4, 4.7, 3.7};

        System.out.println( "Arrays.toString(prices) result "+ Arrays.toString(prices)   );

        String priceString = Arrays.toString(prices) ;
        System.out.println("priceString = " + priceString);

        // we are looping over a String not an array so we after at last character finishes
        for (int i = 0; i < priceString.length() ; i++) {
            System.out.println("character at index "+i +"is : "+ priceString.charAt(i));
        }
    }
}
