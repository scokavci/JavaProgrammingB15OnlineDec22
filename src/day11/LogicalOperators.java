package day11;

public class LogicalOperators {
    public static void main(String[] args) {

        //Logical Operators
        // In Java there is no range check directly like math
        // in math 60< x < 100
        // in java x > 60 && x < 100

        // && double ampersand  & ampersand -->> Logical AND operator
        // check both conditions are true at the same time

        /*              true       true
        int x = 70;    x > 60 && x < 100 ;  true
        *               false        true
        int x = 10;    x > 60 && x < 100 ; false
        *              true         false
        int x = 110;   x > 60 && x < 100 ; false
        *              false
        int x = 110;   x < 60 && x < 100 ; false

         */

        // || double pipes or 1 | pipe is used for compiling 2 conditions : Logical OR Operator
        // if you have 2 conditions to check :
        // when this will be true : As long as one side is true , whole result will be true.

        /*
                     true      false
        int x = 70; x > 10 || x < 5;     true
                    false      false
        int x = 7;  x > 10 || x < 5;     false
                    true      false
        int x = 17; x > 10 || x < 5;     true
        negative 8   false    true
        int x = -8; x > 10 || x < 5;     true

         */
        System.out.println("TRUTH TABLE");
        System.out.println("RESULT OF true && true: "+ (true && true));
        System.out.println("RESULT OF false && true: "+ (false && true));
        System.out.println("RESULT OF true && false: "+ (true && false));
        System.out.println("RESULT OF false && false: "+ (false && false));


        System.out.println("TRUTH TABLE");
        System.out.println("RESULT OF true || true: "+ (true || true));
        System.out.println("RESULT OF false || true: "+ (false || true));
        System.out.println("RESULT OF true || false: "+ (true || false));
        System.out.println("RESULT OF false || false: "+ (false || false));

        int x = 55;
        System.out.println(     x > 100 || x < 10);
        System.out.println(     x > 10  &&  x < 60);

        //more than two conditions at the same time
                            //     true   || false -->> true
        System.out.println(  true || false || false);

        //                      true && false -->> false
        System.out.println( true && true && false);
                           // false || false --true >> true
        System.out.println( x==50 || x==51 || x ==55);

       // check x is more than 50 and x is not 52 or x equal to 57
        // == checking equality //  = assigning operator
                        //   true      true = true  or false = true
        System.out.println( x>50  &&  x != 52  || x == 57);

        System.out.println( false || true && true );

    }
}