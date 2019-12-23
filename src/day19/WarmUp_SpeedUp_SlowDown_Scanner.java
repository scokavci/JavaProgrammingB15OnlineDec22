package day19;

import java.util.Scanner;

public class WarmUp_SpeedUp_SlowDown_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting speed and ending speed");

        int start = scan.nextInt();
        int end = scan.nextInt();

        if( start < end) {
            System.out.println("Increasing the speed");
            for (int i = start; i <= end; i++) {
                System.out.print(i + ",");
            }
        }else if( start > end){
            System.out.println("Decreasing speed");
            for (int x = start; x > end ; x--) {
                System.out.print(x+ " ,");
            }
        }else{
            System.out.println("NO ACTION NEEDED !!! SAME SPEED!!!!");
        }
    }
}


