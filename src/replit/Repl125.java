package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Repl125 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] str1 = str.split(",");

        int shortestWordL = str1[0].length();
        String mystr = "";

        for (int i = 0; i <str1.length ; i++) {
             if( shortestWordL > str1[i].length()    ){
                 shortestWordL = str1[i].length();
                 mystr += str1[i] ;
                // System.out.println("mystr = " + mystr);
             }
        }

        String[] mystrarr = mystr.split(",");

        Arrays.sort(mystrarr);
        System.out.println(   Arrays.toString(mystrarr)  );
    }
}
