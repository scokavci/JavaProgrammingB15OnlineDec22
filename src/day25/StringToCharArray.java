package day25;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        
        String name = "Sumeyye";
        // turn this into charArray using toCharArray() method of String
        // 1ST: WHAT DOES IT DO?
        // toCharArray() is a method of String that turn a string into char Array
        // 2ND: Do I need to provide extra data while calling this method?
        // no
        // 3RD: what do I get out of it?
        // char array object that has all characters of String object
        
        char[] allCharsInName = name.toCharArray();  //{S, U, M, E, Y, Y, E}

         for(char eachChar : allCharsInName){
             System.out.println("eachChar = " + eachChar);
         }
        // now count how many e we have
        int count =0;
         for (char eachChar : allCharsInName){
             if(eachChar == 'e'){
                 count++;
             }
         }
        System.out.println("count = " + count);

         //what if you want to sort all characters of your name
        // in alphatical order?

        System.out.println("Before sorting allCharsInName = "+Arrays.toString(allCharsInName));
        Arrays.sort(allCharsInName);
        System.out.println("After sorting allCharsInName = "+Arrays.toString(allCharsInName));
    }
}
