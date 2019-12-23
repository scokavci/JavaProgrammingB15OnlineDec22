package day06;

import java.util.Scanner;

public class SaleCalculator {
        public static void main(String[] args) {
            //wake up task
            //create a program to calculate the final discounted price of an item
            //create three variables called

            Scanner scan = new Scanner(System.in);
           // double regularPrice;
           // double salePrice;
           // double discount;
//          if you have variables with same data type, you can declare them in one like this:
            double regularPrice ,salePrice, discount;

            System.out.println(" What is the regular price?");
            regularPrice = scan.nextDouble();

            System.out.println(" What is discount rate?");
            discount = scan.nextDouble();
            salePrice = regularPrice - regularPrice * discount;

            System.out.println("regular price is " + regularPrice
                    + "$ , discount is " + discount + "  and your got deal for " + salePrice + "    $");
        }
    }

