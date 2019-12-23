package day05;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {
        // ask user for name
        Scanner scan= new Scanner(System.in);
        System.out.println("What is your name?: ");
        //String name = Sam
        String firstName = scan.next();
        System.out.println("My name is " + firstName);

        System.out.println("What is your birth year?: ");
        int birthyear = scan.nextInt();
        int age = 2019 - birthyear;
        System.out.println("Your age is " + age);
        // System.out.println( age);

        System.out.println("What is your height? ");
        double height = scan.nextDouble();
        System.out.println("your height is : " + height);

    }
}
