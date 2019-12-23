package tutorialPractice;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner keyword = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int nextNum = keyword.nextInt();
        int total = 0;

        while( nextNum > 0){
            total = total+ nextNum ;
            nextNum = keyword.nextInt();
        }
        System.out.println("total = " + total);
    }
}
