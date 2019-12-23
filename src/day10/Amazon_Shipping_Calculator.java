package day10;

public class Amazon_Shipping_Calculator {
    public static void main(String[] args) {
        double itemPrice = 35;
        boolean primeMember = true;


        if(primeMember == true && itemPrice > 35){
            double shippingCost = 0;
            double finalCost = itemPrice + shippingCost;
            System.out.println("You get SAME DAY FREE delivery and your total cost is $"+finalCost);
        }else if(primeMember == true && itemPrice <= 35){
            double shippingCost = 5.99;
            double finalCost = itemPrice + shippingCost;
            System.out.println("You get SAME DAY delivery;shipping & handling fee is $" +shippingCost+
                               "  your total cost is $"+finalCost);
        }else if(primeMember == false) {
            double shippingCost = 9.98;
            double finalCost = itemPrice + shippingCost;
            System.out.println("You get SAME DAY delivery;shipping & handling fee is $"+shippingCost+
                               "  your total cost is "+finalCost);
        }else{
            double shippingCost = 6.99;
            double finalCost = itemPrice + shippingCost;
            System.out.println("You get Standard Delivery which it may take from 4 to 7 days." +
                              "Your shipping & handling fee is: $"+shippingCost+ " your total cost is $"+finalCost);

        }
    }
}
