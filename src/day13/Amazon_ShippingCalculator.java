package day13;

import java.util.Scanner;

public class Amazon_ShippingCalculator {
    public static void main(String[] args) {
        String memberType = "member";
        double amount = 15.99d;
        int shippingFee = 0;

        if (memberType.equalsIgnoreCase("Prime member")) {
            System.out.println("You get one day free shipping !!!");
            System.out.println("Your final price is " + amount);
            // }else if( amount > 25){
        } else if(  ! memberType.equalsIgnoreCase("Prime member") && amount > 25){
            System.out.println("NOT A PRIME MEMBER BUT YOU ORDER IS MORE THAN 25");
            System.out.println("You GOT free shipping on amount "+amount);
        } else {
            System.out.println("Do you want to sign up for prime membership? ");
            shippingFee = 5 ;
            amount += shippingFee;
            System.out.println("Your final amount is "+amount);

        }

    }
}
