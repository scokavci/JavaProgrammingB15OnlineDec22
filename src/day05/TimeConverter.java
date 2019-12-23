package day05;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("how many days? ");
        int numberOfDay = scan.nextInt();
        System.out.println("how many minutes?");
        // 1 day has 1440 minutes
        int totalOfMinute = numberOfDay * 1440;
        System.out.println(numberOfDay+ " days have "+ totalOfMinute+" minutes.");

    }
}
