package day18;

import java.util.Scanner;

public class GiveMe5$Or20$ {

    public static void main(String[] args) {

        // keep asking for $5 , $20 until you get them
        Scanner scan = new Scanner(System.in);
        System.out.println("give me $5, $20 !! ");

        int x = scan.nextInt() ;
         //  !  (  x==5 || x == 20  )
        while(  x !=5 && x !=20 ){
            System.out.println("Not The Bill I am Looking For");
            System.out.println("Give Me 5 or 20");
            x = scan.nextInt();
        }

        System.out.println("The Happy ending !! GOT THE MONEY");
    }
}
