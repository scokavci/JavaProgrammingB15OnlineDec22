package tasksStringby_Teacher;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter sentence with more than 1 word");
        String sentence = scan.nextLine();

        int firstSpace = sentence.indexOf(" ");
        String firstWord = sentence.substring(0,firstSpace);
        System.out.println("firstWord = " + firstWord);
        
        int lastSpace = sentence.lastIndexOf(" ");
        int indexofLast = lastSpace + 1;
        String lastWord = sentence.substring(indexofLast);
        System.out.println("lastWord = " + lastWord);


    }
}
