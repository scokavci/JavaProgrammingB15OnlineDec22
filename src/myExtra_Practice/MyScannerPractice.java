package myExtra_Practice;

import java.util.Scanner;

public class MyScannerPractice {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        String firstName = input.next();
        System.out.println("Nice to meet with you, " + firstName);

        System.out.println( "What is your age? ");
        int age = input.nextInt();
        System.out.println("My age is: " +age);

    }

}
