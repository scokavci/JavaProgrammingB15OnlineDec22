package day12;

import java.util.Scanner;

public class WarmUp_SeasonFinder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month number:");
        int month = scan.nextInt();

        if( month < 1 || month > 12){
            System.out.println("INVALID MONTH");
        }else if( month >= 3 && month <= 5){
            System.out.println("it's spring");
        }else if( month >= 6 && month <= 8){
            System.out.println("it's summer");
        }else if( month >= 9 && month <= 11){
            System.out.println("it's fall");
        }if( month == 1 || month == 12 || month == 2){
            System.out.println("it's Winter!");
        }

    }
}
