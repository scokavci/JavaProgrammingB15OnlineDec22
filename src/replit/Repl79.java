package replit;

import java.util.Scanner;

public class Repl79 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
         if(word.contains("x") || word.contains("X")){
             String newWord = word.replace("x", "").replace("X","");
             System.out.println(newWord);
         }else{
             System.out.println(word);
         }
    }
}