package tasksStringby_Teacher;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence that has three words");
        // I love Java
        String sentence = scan.nextLine();

        int firstSpace = sentence.indexOf(" ");
        int firstLetterPlace = firstSpace +1;

        int lastSpace = sentence.lastIndexOf(" ");
        System.out.println(    sentence.substring(firstLetterPlace,lastSpace)  );

    }
}
