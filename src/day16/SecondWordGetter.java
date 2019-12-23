package day16;

import java.util.Scanner;

public class SecondWordGetter {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter three words");
        // I love Java
        String sentence = scan.nextLine();
        String secondWord = "";
        int firstspaceIndex = sentence.indexOf(" ");
        System.out.println("firstspaceIndex = " + firstspaceIndex);

        int lastspaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastspaceIndex = " + lastspaceIndex);

        secondWord = sentence.substring( firstspaceIndex + 1 , lastspaceIndex) ;
        System.out.println(  secondWord);

        // HOW TO GET FIRST WORD: FROM 1st character till space

        String firstWord = sentence.substring( 0  , firstspaceIndex);
        System.out.println("firstWord = " + firstWord);
        
        // how to get last word -->>> from last space till rest
        // if I don't add +1, I just include space ( Java)
        String lastWord = sentence.substring( lastspaceIndex + 1);
        System.out.println("lastWord = " + lastWord);
    }
}
