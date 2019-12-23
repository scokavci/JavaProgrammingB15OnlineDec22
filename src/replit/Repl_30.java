package replit;

import java.util.Scanner;

public class Repl_30 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String item1, item2, item3;
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();

        double totalprice1, totalprice3, totalprice2;

        if (count1 > 0 && count2 > 0 && count3 > 0) {

            totalprice1 = count1 * price1;
            totalprice2 = count2 * price2;
            totalprice3 = count3 * price3;
            System.out.println("Item1: " + item1 + " Price: " + totalprice1 + ", " +
                    " Item2: " + item2 + " Price: " + totalprice2 + ", " +
                    " Item3: " + item3 + " Price: " + totalprice3);

            totalPrice = totalprice1 + totalprice2 + totalprice3;
            System.out.println("Total price: " + totalPrice);

        } else if (count1 <= 0 && count2 > 0 && count3 > 0) {

            totalprice2 = count2 * price2;
            totalprice3 = count3 * price3;
            System.out.println(" Item2: " + item2 + " Price: " + totalprice2 + ", " +
                    " Item3: " + item3 + " Price: " + totalprice3);

            totalPrice = totalprice2 + totalprice3;
            System.out.println("Total price: " + totalPrice);

        } else if (count1 > 0 && count2 <= 0 && count3 > 0 ) {

            totalprice1 = count1 * price1;

        totalprice3 = count3 * price3;
        totalPrice = totalprice1 + totalprice3;
        System.out.println("Item1: " + item1 + " Price: " + totalprice1 + ", " +
                " Item3: " + item3 + " Price: " + totalprice3);
        System.out.println("Total price: " + totalPrice);

    }else if(count1>0 && count2 >0 && count3 >=0) {

        totalprice1 = count1 * price1;
        totalprice2 = count2 * price2;
        System.out.println("Item1: " + item1 + "Price: " + totalprice1 + "," +
                "Item2: " + item2 + "Price: " + totalprice2);
        totalPrice = totalprice1 + totalprice2;
        System.out.println("Total price: " + totalPrice);
    }

}
}
