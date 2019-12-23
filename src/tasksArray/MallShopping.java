package tasksArray;

public class MallShopping {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        //TASK 1. Check if all 3 arrays are exact same length
        //Print "All arrays are equal length"
        int itemsLength = items.length ;  // 6
        int pricesLength = prices.length;  // 6
        int itemIDsLength = itemIDs.length; //6

       if( itemsLength == pricesLength && pricesLength == itemIDsLength ) {
           System.out.println("All arrays are equal length");
       }
       //TASK 2. Print how many items purchased
        //System.out.println("Items count: " + ??);

        System.out.println("Items count: "+ itemsLength);

       //TASK 3. Print a receipt report.
        /*
            12345 - Shoes - $99.99
            ...
            458.8 * 0.06 + 458.8
            Total price: $458.8 (include tax)
         */
        double totalPrice = 0.0;
        for (int i = 0; i < 6 ; i++) {
                    System.out.println( itemIDs[i] +" - "+ items[i] +"- $"+ prices[i]);
                    totalPrice += prices[i];
                }
       // System.out.println(totalPrice);
        float totalPriceWithTax = (float) ( (totalPrice*0.06)+totalPrice) ;
        System.out.println("Total price: "+ totalPriceWithTax);

        //TASK 4. Find/Look for "Airpods" in items and print along with price and itemID
        String[] newitems  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] newprices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] newitemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        for (int i = 0; i < 6 ; i++) {
            if(newitems[i].equals("Airpods")){
                System.out.println("Item: "+newitems[i]+"- its price: $"+ newprices[i]+" Its item Id: "+newitemIDs[i]);
            }
        }
        //TASK 5. Find the most expensive item and print all details
        //{99.99, 150.0, 9.99, 250.0 , 439.50, 39.99}
        double maxPrice = prices[0];
        int maxPriceIndex = 0;
        // YOUR CODE GOES HERE
        for (int i = 0; i < 6 ; i++) {
            if (maxPrice < newprices[i]) {
                maxPrice = newprices[i];
                maxPriceIndex = i;
            }
        }
        System.out.println("Max price = " + maxPrice);
        System.out.println("maxPriceIndex = " + maxPriceIndex);


        // BELOW IS ALREADY WRITTEN FOR YOU
        System.out.println("Most expensive item:");
        System.out.println(itemIDs[maxPriceIndex] + " - " + items[maxPriceIndex] + " - "+prices[maxPriceIndex]);


    }
}
