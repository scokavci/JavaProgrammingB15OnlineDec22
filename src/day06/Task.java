package day06;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner blabla = new Scanner(System.in);

        System.out.println(" What is your name? ");
        String name = blabla.nextLine();
        System.out.println("You have entered: "+ name);

        System.out.println(" Which you city live in, including state? ");
        String cityAndState = blabla.nextLine();
        System.out.println("You have entered City and State:" +cityAndState);

        System.out.println(" What is your street address? ");
        String address = blabla.nextLine();
        System.out.println("Your street adress: "+ address);

    }
}
