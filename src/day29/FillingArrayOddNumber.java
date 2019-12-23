package day29;

import java.util.Arrays;

public class FillingArrayOddNumber {
    public static void main(String[] args) {

        // create an int array size 100 and fill it up as below
        // fill up this array with odd number starting from 0

        // this is the way without loop
        int[] numbers = new int[100];
        numbers[0] = 1; // i*2 +1 = 1
        numbers[1] = 3; // i*2 +1 = 3
        numbers[2] = 5; // i*2 +1 = 5
        numbers[3] = 7; // i*2 +1 = 7

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = (i * 2) +1 ;
        }
        System.out.println( Arrays.toString(numbers));

    }
}
