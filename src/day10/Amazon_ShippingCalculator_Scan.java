package day10;

import java.util.Scanner;

public class Amazon_ShippingCalculator_Scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to purchase?");
        String item = scan.next();
        System.out.println("What is the price of the item you chose?");
        double itemOfPrice = scan.nextDouble();
        System.out.println("Are you prime member?");
        boolean primeMember = scan.nextBoolean();

        if (primeMember == true && itemOfPrice > 35) {
            double shippingCost = 0;
            double finalCost = itemOfPrice + shippingCost;
            System.out.println("You get SAME DAY FREE delivery and your total cost is $" + finalCost);
        } else if (primeMember == true && itemOfPrice <= 35) {
            double shippingCost = 5.99;
            double finalCost = itemOfPrice + shippingCost;
            System.out.println("You get SAME DAY delivery;shipping & handling fee is $" + shippingCost +
                    "  your total cost is $" + finalCost);
        } else if (primeMember == false) {
            double shippingCost = 9.98;
            double finalCost = itemOfPrice + shippingCost;
            System.out.println("You get SAME DAY delivery;shipping & handling fee is $" + shippingCost +
                    "  your total cost is " + finalCost);
        } else {
            double shippingCost = 6.99;
            double finalCost = itemOfPrice + shippingCost;
            System.out.println("You get Standard Delivery which it may take from 4 to 7 days." +
                    "Your shipping & handling fee is: $" + shippingCost + " your total cost is $" + finalCost);

        }
    }
}
