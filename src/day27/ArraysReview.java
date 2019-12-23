package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview {
        /*
        declaration:
           Data-Type[] variableName = {data1,data2,....};
           Array' size is fixed, not changed. immutable
           Array's size must be initialize before use it.
        Array: a variable that allows us to store multiple values
        Regular variables: we can only store one single value int n1 = 10;
        Array variables: we can store more than a value int[] arr = [1,2,3];
        to retrieve data:  arr[indexnumber]==>> element of index number
        Another rule: array variable contain multiple datas. so
        Array MUST be converted to String
         */
        public static void main(String[] args) {
        int num = 10 ; // only one value
                 //  0  1   2   3   4    5
        int[] arr = {10,20, 30, 40, 50, 60};  // multiple data
            // length: returns the total number of elements from the array
            //last index num = arr.length-1
        int num1 = arr[arr.length-1];

        // expected: 10 20 30 40 50 60
                for(int x = 0; x < arr.length;x++ ){
                        System.out.print(arr[x]+ " ");
                }
                System.out.println("\n=====================");
         // Arrays.toString(VariableName):
        String str =  Arrays.toString(arr);  // when an array
                System.out.println(Arrays.toString(arr));

         // Task01: write a program that asks user to enter number 5 times
         // and store those number into array
                int[] numbers = new int[5];
                System.out.println(Arrays.toString(numbers)); //{0,0,0,0,0} because no value.
         Scanner scan = new Scanner(System.in);
               for(int i = 0; i<5;i++) {
                       System.out.println("Enter a number: ");
                       //int input = scan.nextInt(); // returns int data type
                       numbers[i] = scan.nextInt();
               }
                System.out.println(Arrays.toString(numbers));
               // Arrays.sort(variableName): sorts the array in ascending order
            Arrays.sort(numbers);

            int largestNumber = numbers[numbers.length -1];
            int minNumber = numbers[0];
            System.out.println("Largest Number = " + largestNumber);
            System.out.println("Min Number = " + minNumber);


    }
}
