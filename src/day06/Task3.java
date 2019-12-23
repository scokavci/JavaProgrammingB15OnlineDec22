package day06;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to order? ");
        String yourOrder = scan.next();
        String myOrder = yourOrder;

        System.out.println("I want to order same as you ordered "+ yourOrder);

    }
}
