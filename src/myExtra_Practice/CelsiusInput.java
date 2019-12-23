package myExtra_Practice;

import java.util.Scanner;

public class CelsiusInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Fahrenheit : ");

        int fahrenheit = input.nextInt();
        double celsius;

        celsius = (5.0/9)*(fahrenheit-32);

        System.out.println( "It will be in celsius " +celsius+ "C.");

    }
}
