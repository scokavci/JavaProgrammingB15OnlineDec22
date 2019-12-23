package day11;

public class LogicalOperator_Single {

    public static void main(String[] args) {

        // && ampersand  and & ampersand  --->> Logical Operator
        // && is CALLED SHORT CIRCUIT
        // example rocket launching
        //  isEngineRunning && isCommunicationSystemWorking && isAirEnough
        // if isEngineRunning is false then it does not go and check next conditions

//        System.out.println( 7>5 && 1>7);
//        System.out.println( 5>5 && 1>7);
//        System.out.println( 1>5 && 9>7);
//          only order changes. results same
//        System.out.println( 7>5 & 1>7);
//        System.out.println( 5>5 & 1>7);
//        System.out.println( 1>5 & 9>7);

        //System.out.println( 9/0 ); //ERROR !!!CAN NOT DIVIDE BY ZERO
        // I want to check whether dividing 9 by 0 is 3

       // System.out.println( 9/0 == 3 ); ERROR! cannot divide by zero

        // combine the result of 5 is more than 10 and 9 divided by zero is 3
        //&& only checks one condition short circuit from lest to right
        //& has to check both conditions.

        System.out.println(5>10 && 9/0 == 3);
        // difference between && and &
        // && checks from left to right and doesn't check all conditions if its not needed.
        //& single ampersand checks all conditions.
       // System.out.println(5>10 & 9/0 == 3);

        //               true checks one enough-->> result is true
        System.out.println(10>5 || 9/0 == 3);
       // System.out.println(10>5 | 9/0 == 3);
              // checks all conditions since its | single pipe
    }
}
