package office_hour;

import java.util.Scanner;

public class Practice_11_26 {
    public static void main(String[] args) {

        /* pseudo code
        you have an option to buy food or drink
        under food you have meal or snack
        under drink you buy soda or juice
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want food or drink? ");
        String mainOptions = scan.next();


        if (mainOptions.equalsIgnoreCase("food")) {
            System.out.println("You have selected food");

            System.out.println("Do you want meal or snack? ");
            String secondaryOption = scan.next();
            if (secondaryOption.equalsIgnoreCase("snack")) {
                System.out.println("You have selected snack");

            } else if (secondaryOption.equalsIgnoreCase("meal")) {
                System.out.println("You have selected meal");
            } else {
                System.out.println("No such food option");
            }
            }else if(mainOptions.equals("drink") ){
            System.out.println("You have selected drink");
            String drinkOptions = scan.next();
        }
    }
}

