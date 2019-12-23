package day05;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GroceryActions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" What is the price of potato? ");
        float priceOfPotato = scan.nextFloat();

        System.out.println("How many potatoes do you want to buy ? ");
        int numberOfPotato = scan.nextInt();
        float costOfPotato = priceOfPotato * numberOfPotato;

        //System.out.println("The cost of potatoes that I bought: $ " + (numberOfPotato * priceOfPotato));

        System.out.println("What is the price of tomato? ");
        float priceOfTomato = scan.nextFloat();
        System.out.println("How many tomatoes do you want to buy? ");
        int tomatoCount = scan.nextInt();
        float costOfTomatoes = priceOfTomato * tomatoCount;

        //System.out.println("The cost of tomatoes that I bought: $ " + (tomatoCount * priceOfPotato));

        System.out.println("What is the price of bananas? ");
        float priceOfBanana = scan.nextFloat();
        System.out.println("How many bananas do you want to buy? ");
        int numberOfBanana = scan.nextInt();
        float costOfBananas = priceOfBanana * numberOfBanana;

        float totalCost = costOfBananas + costOfPotato + costOfTomatoes;
        //System.out.println("The cost of banana that I bought: $" +(priceOfBanana * numberOfBanana));

        System.out.println("You got "+numberOfPotato+ " potatoes."+"Price is $"+priceOfPotato+" and total is $"+costOfPotato);
        System.out.println("You got "+tomatoCount+ " tomatoes."+ "Price is $"+priceOfTomato+ "and total is $"+ costOfTomatoes);
        System.out.println("You got "+numberOfBanana+ " bananas. "+"Price is $"+priceOfBanana+"and total is $"+costOfBananas);

        System.out.println("Your grand total for this shopping is $" + totalCost);
    }
}
