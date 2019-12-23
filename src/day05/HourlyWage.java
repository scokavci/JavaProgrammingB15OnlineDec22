package day05;

import java.util.Scanner;

public class HourlyWage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("write your hourly wage: ");
        int hourlyWage = scan.nextInt();
        System.out.println("How many hours you work? ");
        int totalhoursOfWork = scan.nextInt();

        System.out.println("your yearly wage is " + (totalhoursOfWork*hourlyWage));

    }
}
