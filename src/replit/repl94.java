package replit;

import java.util.Scanner;

public class repl94 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do{
            System.out.println("Enter Item"+count+ " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            shoppingListReport += "Item"+count+": "+item+" Price: "+price+", ";
            totalPrice += price ;
            ++count;
            System.out.println("Add one more item?");
            countinue = scan.next();
        }while( countinue.equals("yes")  );
        int mylen = shoppingListReport.length() - 2;
        System.out.println(   shoppingListReport.substring(0,mylen) );
        System.out.println("Total price: "+totalPrice);


    }
}
