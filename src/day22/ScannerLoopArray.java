package day22;

import java.util.Scanner;

public class ScannerLoopArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10] ;

        for (int x = 0; x < numbers.length; x++) {

            System.out.println("Enter your number "+ (x+1) );
            // filling up the array value with scanner
            numbers[x] = scan.nextInt();
        }
        // printing out what is inside the array
        for (int x = 0; x < numbers.length; x++) {

            System.out.print(  numbers[x]+ " ");
        }
    }
}
