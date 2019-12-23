package day22;

public class ArrayPractice1 {
    public static void main(String[] args) {

        double[] prices = new double[5];

        // if you don't give any value , you get zero
        System.out.println( prices[0]   );

        // can not print out array variable directly
        // to see what's inside
        System.out.println( prices);

        prices[0] = 2.46 ;
        prices[1] = 12.96 ;
        prices[2] = 992.1 ;
        prices[3] = 500 ;
        prices[4] = 165.3 ;
        // what happen if I go over the range
        // RUN TIME ERROR!!!
       // prices[5] = 167.3 ;

        System.out.println( prices[0]);
        System.out.println( prices[1]);
        System.out.println( prices[2]);
        System.out.println( prices[3]);
        System.out.println( prices[4]);


    }
}
