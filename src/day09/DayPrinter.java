package day09;

import java.util.Scanner;

public class DayPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        if(number == 1){
            System.out.println("It's Monday. ");
        } else if(number == 2){
            System.out.println("It's Tuesday. ");
        } else if(number == 3){
            System.out.println("It's Wednesday. ");
        }else if(number == 4){
            System.out.println("It's Thursday. ");
        }else if(number == 5){
            System.out.println("It's Friday. ");
        }else if(number == 6){
            System.out.println("It's Saturday. ");
        }else if(number == 7){
            System.out.println("It's Sunday. ");
        }else{
            System.out.println("That number doesn't represent any day");
        }
    }

}


