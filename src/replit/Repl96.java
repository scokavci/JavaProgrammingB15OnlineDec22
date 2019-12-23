package replit;

import java.util.Scanner;

public class Repl96 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String newStr = " ";
        for( int times = 1 ; times < count ; times++){
            if( count==1){
                System.out.println(word);
            } else {
                newStr = newStr + word +" ";
            }
        }
        System.out.print( newStr) ;
    }
}

