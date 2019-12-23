package tasksStringby_Teacher;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence that has at least two words and one space");
        String sentence = scan.nextLine();
        sentence = sentence.trim();

        int firstSpace = sentence.indexOf(" ");
        int lastSpace = sentence.lastIndexOf(" ");
        if(  firstSpace == lastSpace){
            System.out.println("You have entered two words");
        }else{
            System.out.println("You have more than two words");
        }

    }
}
