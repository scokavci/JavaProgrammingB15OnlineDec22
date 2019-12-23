package replit;

import java.util.Scanner;

public class Repl_64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int charCount = word.length();

        if( charCount%2 == 1 ){
            if(charCount >= 3 ){
                int middleindex = charCount/2;
                System.out.println(word.charAt(middleindex));
            }else if( charCount == 1){
                System.out.println( word+word+word);
            }
        }
        else if( charCount%2 == 0){
            if(charCount >= 4){
                int m1 = charCount/2;
                int m =  m1 - 1;
                System.out.println(""+word.charAt(m)+word.charAt(m1) );
            } else if( charCount == 2){
                System.out.println(word+word);
            }
        }

    }
}

