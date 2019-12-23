package day08;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" what is my favorite number? ");
        int myFavoriteNumber = scan.nextInt();

        if ( myFavoriteNumber == 300){
            System.out.println("BINGO!!!");
        }else {
            System.out.println(" That's not true. Please try again. ");
        }

    }
}
