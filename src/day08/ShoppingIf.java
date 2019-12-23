package day08;

import java.util.Scanner;

public class ShoppingIf {
    public static void main(String[] args) {
        Scanner bla = new Scanner(System.in);
        System.out.println("Would you like to go shopping? ");

        boolean answer = bla.nextBoolean();

        if(answer == true){
            System.out.println("What would you like to buy? ");
            String item1 = bla.next();
            System.out.println(" how many do you want to buy? ");
            int number = bla.nextInt();
            System.out.println("I want to buy " +number+" " +item1+".");
        }else {
            System.out.println(" Stay home and Stay warm. ");
        }
    }
}
