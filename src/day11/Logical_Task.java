package day11;

import java.util.Scanner;

public class Logical_Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
       // System.out.println(num < 10 || num > 100);
       // System.out.println(num > 10 && num < 60);
        int num = scan.nextInt();

        if (num < 10 || num > 100){
            System.out.println("false");
        }else if( num > 30 && num < 120  ){
            System.out.println("true");
        }

    }
}
