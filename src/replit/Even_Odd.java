package replit;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter yur number:");
        int number = scan.nextInt();
        String evenOdd ="";

        if (number%2 == 0){
             evenOdd ="Even";
        }else {
            evenOdd = "Odd";
        }
        System.out.println("This "+number+" is "+evenOdd);

    }
}
