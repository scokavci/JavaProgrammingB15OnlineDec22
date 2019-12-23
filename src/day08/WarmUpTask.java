package day08;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        /*
        *Voting eligibility program
        * create a variable called age as int
         */
        Scanner input =new Scanner (System.in);
        int age = input.nextInt();

        if(age >= 18) {
            System.out.println("you are ready to vote!!!");
        }else{
            System.out.println(" wait until you are 18");
        }

    }
}
