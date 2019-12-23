package replit;

import java.util.Scanner;

public class Vending_Machine {
    public static void main(String[] args) {
        //ENTER CODE HERE
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Price in cents:");

        int itemPrice = scan.nextInt();
        int quarters, dimes, nickels;

        if (itemPrice < 25 || itemPrice > 100 || itemPrice % 5 != 0) {
            System.out.println("Invalid price!");
        } else if (itemPrice % 5 == 0) {

            int change = 100 - itemPrice;
            quarters = change / 25;
            int change1 = change % 25;
            dimes = change1 / 10;
            //dimes = (change % 25) / 10;
            int change2 = change1 % 10;
            //nickels = ((change % 25) % 10) / 5;
            nickels = change2 / 5;
            System.out.println("Your change is " + quarters + " quarters " + dimes + " dimes " + " and " + nickels + " nickels");
        }

    }
}

