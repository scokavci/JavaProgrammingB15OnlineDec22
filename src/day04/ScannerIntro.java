package day04;
import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
          // I want to save users input after asking some questions
          // and I want to save this input so I can do something with it
          // Step 1:  Use scanner class to create scanner object
                       // that have this functionality
        Scanner scan = new Scanner (System.in) ;
        // ask user to enter name
        System.out.println("Enter your first name please : ");

        // capture what user typed on keyword in console for name
        // scan.next() is capturing single word that user entered
        String firstName = scan.next();
        // print the result of what we say from user input
        System.out.println("You have entered : " + firstName);

        //ask a  question from user before entering
        System.out.println("What is your age ?");
        // capture what user typed on keyword in console for age
        // print the result of what we say from user input
        // scan.nextInt() is capturing single number that user entered
        int age = scan.nextInt();
        System.out.println("your age is : " + age);


    }
}
