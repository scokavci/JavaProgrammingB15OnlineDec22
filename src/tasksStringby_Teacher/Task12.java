package tasksStringby_Teacher;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter at least two characters");
        String word = scan.next();
        char c1 = word.charAt(0);
        int len = word.length();
        char clast = word.charAt(len-1);
        String  middle = word.substring(1,len-1);

        System.out.println(""+clast+middle+c1);


//        Given a String with at least two characters
//        swamp first character with last character
//        for example
//        Java --> aavJ , Kawap --> pawaK
    }
}
