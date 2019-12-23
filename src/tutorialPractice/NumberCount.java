package tutorialPractice;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {

        Scanner keyword = new Scanner(System.in);
        System.out.println("Enter a number:");
        int count, number ;

        number = keyword.nextInt();

        count = 1;
        while(  count <= number){
            System.out.print( count + " ,");
            //++ count ;
            count += 5;
        }
    }
}
