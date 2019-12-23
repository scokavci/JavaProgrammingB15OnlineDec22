package day10;

public class MultiBranch_WithSwitch {
    public static void main(String[] args) {
        String order = "";
        int itemNumber = 11;
        // only byte, short, int, char, String
        switch (itemNumber) {
            case 11:
                System.out.println("You have selected 11");
                order = "Burger";
                break;
            case 5:
                System.out.println("You have selected 5");
                order = "French fry";
                break;
            case 8:
                System.out.println("You have selected 8");
                order = "Nuggets";
                break;
            case 35:
                System.out.println("You have selected 35");
                order = "Ice cream";
                break;
            default:
                System.out.println("YOU HAVE SELECTED UNKNOWN");
                order = "unknown";
        }
        System.out.println("Your order is "+order);
    }
}
