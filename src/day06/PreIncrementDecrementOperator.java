package day06;

public class PreIncrementDecrementOperator {
    public static void main(String[] args) {
        //initializing(giving the value) offerCount value to 2
        int offerCount = 2;
        //increasing the number by one using normal way
        offerCount = offerCount + 1;

        // This is increasing the value by one using compound/shorhand operator
        offerCount += 1;

        //often used in programming
        //we use ++ or --, this is exclusively for increasing or decreasing by 1
        //we cannot use it for any other time like increasing or decreasing by more than 1
        ++ offerCount;
        System.out.println("Offer Now increasing by 1: "+offerCount);
        -- offerCount;
        System.out.println("Offer Now after decreasing by 1: "+offerCount);

    }
}
