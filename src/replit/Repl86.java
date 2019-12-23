package replit;

import java.util.Scanner;

public class Repl86 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------
        System.out.println("Please enter guest name:");
        String guestlist = input.nextLine();
        int count =1;

        for ( int num = 1 ; num <= count ; num++){
            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();
            if(answer.equals( "yes")){
                System.out.println("Please enter guest name:");
                String  guestName = input.next();
                guestlist = guestlist +", "+ guestName ;
                 ++count ;
            }else if(answer.equals("no")) {
                System.out.println("Guest's list: "+guestlist);
            }
        }
    }
}

