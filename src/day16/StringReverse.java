package day16;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word with 4 characters");
        String word1 = scan.next();
        String word2 ="";
        // we have to write "" between characters otherwise we just get ASCII numbers.
        // there are 4 ways to concatenate characters.

        word2 = word1.charAt(3)+""+ word1.charAt(2)+""+word1.charAt(1)+""+word1.charAt(0);
       // word2 = ""+ word1.charAt(3)+ word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
       // word2 = word2 + word1.charAt(3)+ word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        // word2 += word1.charAt(3)+""+ word1.charAt(2)+word1.charAt(1)+word1.charAt(0);

        System.out.println( word2  );

        // I want to add world at the end of it
        String msg = "Hello";
               //msg = msg + "World!";
               msg += " World!";
        System.out.println(msg);
    }
}
