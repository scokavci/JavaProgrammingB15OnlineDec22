package day27;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        // single dimension array
        int[] arr1D = {1,2,3};
        // [ represents index num of elements
        // arr1D[1] ==>> 2

        // 2D array: is an array that contains single dimensional arrays
        //                  0 1 2    0 1 2
        int[][] arr2D = {  {1,2,3}, {4,5,6}};
        // index               0         1

        //[ INDEX NUM OF 1D ARRAYS] [INDEX NUM OF ELEMENTS]
        // arr2D[0] ===>> {1,2,3}
        System.out.println(arr2D.length);
        System.out.println(Arrays.toString( arr2D[0]));  // it returns an int array
        System.out.println(Arrays.toString( arr2D[1]));

        //arr2D[0][2] ==>>
        System.out.println(  arr2D[0][2]); // returns int value

        // print the value 5
        System.out.println( arr2D[1][1]);  // returns int value

        //System.out.println(Arrays.toString( arr2D)); // Arrays.toString is only for single dimensional array
        // this way you get wrong
        System.out.println(Arrays.toString( arr2D[1]));

        // Arrays.deepToString(multi-D Arrays)
        System.out.println(Arrays.deepToString(arr2D));

    }
}
