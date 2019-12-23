package replit;

import java.util.Scanner;

public class Repl_63 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word1 = scan.next();
            String word2 = scan.next();
            //YOUR CODE HERE
             word1 = word1.substring(0 , word1.length() );
             word2 = word2.substring(0,  word2.length() );
             System.out.println(word1+word2+word2+word1);
        }
    }
