package replit;

import java.util.Scanner;

public class Repl93 {

    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length() < 4){
            System.out.println(exists);
        }else if( word.length() >= 4){
              if(  word.substring(0,4).equals("java") || word.substring(1,5).equals("java")  ){
                 System.out.println("true");
              } else {
              System.out.println("false");
             }

        }
    }
}
