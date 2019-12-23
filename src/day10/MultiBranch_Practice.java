package day10;

public class MultiBranch_Practice {
    public static void main(String[] args) {
        // at the McDonald drive thru
        System.out.println("Welcome to McDonald , what can I get for you? ");
        /*
        11, Burger
        5, French fry
        8, Nuggets,
        35. Ice Cream,
         */
        String order = "";
        int itemNumber = 11;

        if(itemNumber == 11){
            System.out.println(" You have selected 11");
            order = "burger";
        }else if(itemNumber == 5){
            System.out.println(" You have selected 5");
            order = "French fry";
        } else if(itemNumber == 8){
            System.out.println(" You have selected 8");
            order = "nuggets";
        }else if(itemNumber == 35){
            System.out.println(" You have selected 35");
            System.out.println(" Yummy!!");
            System.out.println("Enjoy!! ");
            order = "Ice cream";
        }else{
            System.out.println("YOU HAVE SELECTED UNKNOWN ITEM NUMBER@!!");
            order = "unknown";
        }
        System.out.println("Your order is "+order);
    }

}