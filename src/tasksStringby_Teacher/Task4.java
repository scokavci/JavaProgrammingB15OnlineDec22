package tasksStringby_Teacher;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        Task 4:
//        Ask user to enter a word with at least 3 characters
//        print the first character
//        print the last character
//        print the middle character
//        for example : Uighur
//        first character : U
//        last character  : r
//        middle character: g
//                (if the length is even number get the one on the left)

       Scanner scan = new Scanner(System.in);
        System.out.println("enter a word at least three characters");
        String word = scan.next();
        char cfirst = word.charAt(0);
        char clast = word.charAt(  word.length() - 1);
        int  charCount = word.length();

        if(  (charCount % 2) == 0 ){
            char  cmiddle = word.charAt(  (charCount / 2) - 1);
           System.out.println(cfirst + " " + cmiddle + " " + clast);
        }else {
            char cmiddle1 = word.charAt((charCount / 2));
            System.out.println(cfirst + " " + cmiddle1 + " " + clast);
        }
    }
}
