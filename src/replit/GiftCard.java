package replit;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.println("What do you want to buy?");
        String item = scan.nextLine();
       System.out.println("Is the item in the list? ");
        boolean listOfItem = scan.nextBoolean();

       System.out.println("How much is the item you chose?");
        double priceOfItem = scan.nextDouble();

        //WRITE YOUR CODE HERE
        if(listOfItem == true && priceOfItem <= 100){

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:"+ (100-priceOfItem)+"$");
        }else if (listOfItem ==false){
            System.out.println("Invalid item!");

        }else if( listOfItem == true && priceOfItem > 100){
        System.out.println("Sorry, not enough funds on your gift card!");

        }
   }
}

