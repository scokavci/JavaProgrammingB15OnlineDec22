package day21;

public class OrderOfBreakContinue {

    public static void main(String[] args) {

        for (int x = 1; x <=10 ; x++) {

            //break; only one time runs and out of loop
            continue; // skip 10 times
            // this will not work , unreachable code !!! before comes here its already break.
          //  System.out.println("Hello");
        }

        System.out.println("The End");
    }
}
