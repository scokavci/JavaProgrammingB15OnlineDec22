package myExtra_Practice;

import java.util.Scanner;

public class IfElse_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your test score?: ");
        double testScore = scan.nextDouble();
        System.out.println(testScore >= 80.0);

        if (testScore >= 80.0){
            System.out.println("Pass the class. ");
        }
            System.out.println("Fail in the class");

    }
}
