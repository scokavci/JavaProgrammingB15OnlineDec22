package replit;

import java.util.Scanner;

public class ScoreIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result;
        System.out.println("Enter your score: ");
        int score = scan.nextInt();

        if(score>60){
            result= "pass";
        }else{
            result ="fail";
        }
        System.out.println("Exam result is "+result);
    }
}
