package day08;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grade = scan.nextInt();

        if(grade > 90){
            System.out.println(" Great Job !!!");
        }else if( grade >= 80){
            System.out.println("Good grade !!!");
        }else if( grade >= 70){
            System.out.println("Not much good !");
        }else {
            System.out.println("Study Harder !!!");
        }

    }
}
