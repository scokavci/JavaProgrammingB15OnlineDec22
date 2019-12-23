package day24;

public class ShoppingWithArray {
    public static void main(String[] args) {
//        Create a String array of 6 items to store groceryItems
//        {"apple","banana","grape","strawberry","blueberry","kiwi"}
//        Create a float array of 6 float values to store prices
//        { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
        // there are 3 ways to create an array
     // 1st method
    // String[] groceryItems = new String[6];
        // if I dont know what to do inside array just reserve the place
        // 2nd method
     //String[] groceryItems = new String[]{"apple","banana","grape","strawberry","blueberry","kiwi"};

    // 3rd method
        String[] groceryItems = {"apple","banana","grape","strawberry","blueberry","kiwi"};

        int itemCount = groceryItems.length;
        int lastItemIndex = itemCount - 1;
        String lastFruit = groceryItems[lastItemIndex];
        // shortestway
        // groceryItems[groceryItems.length -1]

        for( String eachFruit : groceryItems){

            System.out.print(eachFruit);
            // only print --->> when the fruit is not last item
            if( ! eachFruit.equals(lastFruit)) {
                System.out.print(" -->");
            }
        }
        // print everything in one line with arrow and do not put arrow after last one
        // assume you know last item is kiwi
        // if the fruit kiwi, just don't add it
        // or how to get last item... arr[arr.length - 1]

    }
}
