package day06;

public class CoinConverter {
    public static void main(String[] args) {

        //you have $2
        //how many quarter you can get
        //how many dimes you can get
        //how many nickels you can get
        //how many cents you can get
        int cent = 200;
        // you have purchase for candle for 0.74 cent, what will be your remainder
        cent -= 74; // 126 cent

        int quarter = cent/25; //126/25 ---->>5 , 1 is remaining
        int penny = cent%25;   //126%25 ----->>5 , 1 is remaining

        System.out.println(quarter);
        System.out.println(penny);

        //now I want to try to calculate dime for same money I got after purchase
         int dime = cent / 10; // 126 /10 ----->> 12
               // how much penny I have after getting dime 126%10 ---> 6
        // creating new penny2 for not mixing with previous one
         int penny2 = cent % 10;    /// ---->> 6
        System.out.println(dime);
        System.out.println(penny2);

    }
}
