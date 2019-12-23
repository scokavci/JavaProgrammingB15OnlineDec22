package myExtra_Practice;

import java.util.Scanner;

public class IfSpeeding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your current speed");
        int currentSpeed = scan.nextInt();
        if(currentSpeed >= 60){
            System.out.println("Slow down");
            int diff = currentSpeed - 60;
            currentSpeed -= diff;
            System.out.println(currentSpeed);
        }else{
            System.out.println("Keep driving");
        }
    }
}
