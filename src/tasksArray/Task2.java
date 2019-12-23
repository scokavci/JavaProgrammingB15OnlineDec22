package tasksArray;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
                            //       0      1        2          3           4         5
         String[] groceryItems = {"apple","banana","grape","strawberry","blueberry","kiwi"};
         
//            • 1, loop through each grocery items and print them in one line
        for(String eachFruit : groceryItems){
            System.out.print(eachFruit+ " ");
        }
        System.out.println();
//          1.1 print each items at odd index
        for (int x = 0; x < groceryItems.length ; x++) {
             if(x%2 != 0){
                 System.out.println("Items at odd index " + groceryItems[x]);
             }
        }
        System.out.println();
//          1.2 print all items in reverse order
        for (int x = groceryItems.length-1; x >= 0 ; x--) {
            System.out.print(groceryItems[x] + " ");
        }
        System.out.println();
//          1.3 find out the index location of strawberry
        for (int x = 0; x < groceryItems.length ; x++) {
             if(groceryItems[x].equals("strawberry") ){
                 System.out.println("the index of strawberry: "+x);
             }
        }
        System.out.println();
//          1.4 find out the count of groceries that contains berry in the name
        int countOfBerry = 0;
        for (int x = 0; x < groceryItems.length ; x++) {
            if(groceryItems[x].contains("berry")  ){
                countOfBerry++ ;
            }
        }
        System.out.println("countOfBerry = " + countOfBerry);
//          1.5 print out all the character counts of the grocery items
        for (int i = 0; i <groceryItems.length ; i++) {
            System.out.println(groceryItems[i]+ " has character counts: "+ groceryItems[i].length()+ " ");
        }
        System.out.println();
//          1.6 print out only those items with even character count
           for (int x = 0; x <groceryItems.length ; x++) {
              if( groceryItems[x].length()%2 == 0 ) {
                  System.out.println("The item has even character count = " + groceryItems[x]);
              }
        }
//          1.7 print out only those items END with letter e
        for (int x = 0; x < groceryItems.length; x++) {
             if(groceryItems[x].endsWith("e")  ){
                 System.out.println("Item ends with letter e = " + groceryItems[x]);
             }
        }
        System.out.println();
//          1.8 print out only last 3 characters of all the items
        for(int x = 0; x <groceryItems.length ; x++) {
            System.out.println("Last three characters of the item:");
            System.out.println(groceryItems[x].substring( groceryItems[x].length()-3 ));
        }
//          1.9 create String variable called allItems and store all the items inside array separated by comma.
            String allItems = Arrays.toString(groceryItems);
            System.out.println( allItems);
//• 2, loop through each prices  and print them in one line
        float[] prices = { 1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f  };

        for(float eachPrice : prices){
            System.out.print(eachPrice+ " ");
        }
        System.out.println();
//            2.1 print each prices in even index
        for (int i = 0; i < prices.length ; i++) {
             if(i%2==0){
                 System.out.println("price at even index is:" +prices[i]);
             }
        }
        System.out.println();
//            2.2 print only prices less than 3 dollars
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < 3){
                System.out.println("prices less than $3: "+prices[i]);
            }
        }
//            2.3 print the sum of all the prices and get average
        Float sum = 0f;

        for (int i = 0; i < prices.length; i++) {
             sum+= prices[i];
        }
        System.out.println("sum of all prices=  $" + sum);

//            2.4 print only the second half of prices (last 3)
        String pricesHalf = Arrays.toString(prices); //[1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f]
        for (int i = 2; i <= pricesHalf.length()-3 ; i+=6) {
            System.out.print( pricesHalf.substring(i, i+3 )+ " ") ;
        }
        System.out.println();
//            2.5 print the sum of the middle two prices
               int middleindex = (prices.length/2);
               int middleindexNext = (middleindex+1 );

               System.out.println( "Sum of middle two prices: "+ prices[middleindex] + prices[middleindexNext] );
               System.out.println( );
//            2.6 print only prices more than average price
              float average = (sum/ prices.length) ;
        System.out.println("average = " + average);
//            2.7 find out max price and print out max price and  index of max price
         float max = prices[0];
        for (int i = 0; i < prices.length ; i++) {
             if( prices[i] > max){
                 max = prices[i] ;
             }
        }
        System.out.println(max+ " is max price");
        for (int i = 0; i <prices.length ; i++) {
             if(prices[i] == max){
                 System.out.println("index of max = " + i);
             }
        }
//            2.8 find out the minimum price and index of minimum price
           float min = prices[0];
        for (int i = 0; i <prices.length ; i++) {
             if(prices[i] < min){
                 min = prices[i] ;
             }
        }
        System.out.println("min price= " +min);
        for (int i = 0; i <prices.length ; i++) {
            if(prices[i] == min){
                System.out.println("index of min = " + i);
            }
        }
//            2.9 find out second max price and index(challenging)
        float secondMax = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] >secondMax  &&  prices[i] < max){
                secondMax = prices[i] ;
            }
        }
        System.out.println("secondMax = " + secondMax);
        for (int i = 0; i < prices.length ; i++) {
            if(prices[i] == secondMax){
                System.out.println("index of second max = " + i);
          }
        }
//• 3, assume that the order of grocery Items match the prices in same order do below:
//            3.1 print first item and first price in one print statement -->>  apple price is 1.99
        System.out.println(groceryItems[0]+" price is "+prices[0]);
//            3.2 print last item and last price in one print statement-->>  kiwi price is 2.88
        int lastGItemIndex = groceryItems.length-1 ;
        int lastPItemIndex = prices.length-1;
        System.out.println(groceryItems[lastGItemIndex]+" price is "+prices[lastPItemIndex]);

        System.out.println();
//            3.2 print all items and prices in one for loop together
        for (int i = 0; i < 6 ; i++) {
            System.out.println(  groceryItems[i]+" price is "+ prices[i] );
        }
        System.out.println();
//            3.3 print only those items with price more than 3.11
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] > 3.11){
                System.out.println("prices >3.11= "+prices[i]+" ");
            }
        }
        System.out.println();
//            3.4 print only those items with price more than average
        for (float eachPrice : prices) {
            if(eachPrice > average){
                System.out.println("EachPrice > Average = " + eachPrice);
            }
        }
        System.out.println();
//            3.5 print only those prices of grocery items that contains letter b
        for (int i = 0; i < groceryItems.length ; i++) {
            if(groceryItems[i].contains("b")){
                System.out.println(groceryItems[i] +" has letter b and price is $"+ prices[i]);
            }
        }
        System.out.println();
//            3.6 print the item name with max price
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] == max){
                System.out.println(groceryItems[i]+ " is the maximum price $"+prices[i]);
            }
        }
        System.out.println();
//            3.7 print the item name with min price
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] == min){
                System.out.println(groceryItems[i]+ " is the minimum price $"+prices[i]);
            }
        }
        System.out.println();

//• 4 , Below tasks will modify array :  (for each loop should not be used, try and see why)
//            4.1 swap the value of first item in array with last item of array , swap apple with kiwi
        String[] groceryItems1 = {"apple","banana","grape","strawberry","blueberry","kiwi"};
        System.out.println("before swap: "+Arrays.toString(groceryItems1)  );
         String item1 = groceryItems1[0];
           groceryItems1[0] = groceryItems1[groceryItems1.length-1] ;
           groceryItems1[groceryItems1.length-1] = item1;

        System.out.println("swap first and last items: "+Arrays.toString(groceryItems1) );
        System.out.println();
//           4.2 use for loop to loop through your groceryItems array and modify your items like this :
//    itemValue+itemCharacterCount
        //    For example : {"apple5","banana6","grape5","strawberry10","blueberry9","kiwi4"}
        for (int i = 0; i < groceryItems.length; i++) {

            System.out.println( groceryItems [i]+ groceryItems[i].length()     );

        }
        System.out.println();
//           4.3 increase the value of each prices by one  in prices array
        for (int i = 0; i < prices.length ; i++) {
            prices[i] =  prices[i] + 1 ;
        }
        System.out.println("the value of each price increases by one:"+Arrays.toString(prices));
        System.out.println();
//           4.4 double the value of each prices in your array 1.99-->> 1.99*2
        float[] prices1 = { 1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f  };
        for(int i=0; i<prices1.length;i++){
           prices1[i] = prices1[i] * 2 ;
       }
       System.out.println("double of the value price: "+Arrays.toString(prices1) );
//            4.5 triple the value of each prices if it is less than 2 1.99 -->> 1.99*3
        float[] prices2 = { 1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f  };
        for (int i = 0; i < prices2.length; i++) {
             if(prices2[i] < 2){
                prices2[i] = prices2[i] * 3 ;
             }
        }
        System.out.println("triple of the value price less than 2: "+ Arrays.toString(prices2) );
//            4.6 now find out highest price after the modification
        float highestprice = prices2[0];
        for (int i = 0; i <prices2.length ; i++) {
            if(prices2[i] > highestprice ){
                highestprice = prices2[i] ;
            }
        }
        System.out.println("After modification:"+highestprice);
//           4.7 find out the most expensive item name. (edited)
        for (int i = 0; i <prices2.length ; i++) {
            if( prices2[i] == highestprice){
                System.out.println( "The most expensive item is "+groceryItems[i]);
            }
        }
    }
}
