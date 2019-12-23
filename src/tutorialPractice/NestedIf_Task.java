package tutorialPractice;

public class NestedIf_Task {
    public static void main(String[] args) {

        int typeSelection = 3;
        int drinkSelection = 2;
        double price;
        String drink = "";

        if (typeSelection == 1) {
            System.out.println("Hot drinks:  1.tea   -  2. coffee");
            if (drinkSelection == 1) {
                drink = "Tea";
                price = 2.0;
                System.out.println("Your total for " + drink + " is $" + price);
            } else if (drinkSelection == 2) {
                drink = "Coffee";
                price = 4.0;
                System.out.println("Your total for " + drink + " is $" + price);
            } else {
                System.out.println("invalid hot drink selection! ");
            }
        } else if (typeSelection == 2) {
            System.out.println("Cold drinks:  1.Iced tea  -  2. Lemonade");
            if (drinkSelection == 1) {
                drink = "Iced Tea";
                price = 3.2;
                System.out.println("Your total for " + drink + " is $" + price);
            } else if (drinkSelection == 2) {
                drink = "Lemonade";
                price = 3.5;
                System.out.println("Your total for " + drink + " is $" + price);
            } else {
                System.out.println("invalid cold drink selection! ");
            }
        } else {
            System.out.println("Invalid type of selection. ");
        }
        if (drink.equals("none")) {
            System.out.println("Please try again!");
        }
    }

}




