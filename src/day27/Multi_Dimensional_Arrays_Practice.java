package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Practice {

    public static void main(String[] args) {

        // N Dimensional array must contains (N-1) dimensional arrays
        // 2 dimensional arrays MUST contains (2-1) dimensional array

        // index of 1D array         0          1               0         1
        String[][] names = {   {"Rukhshona","Ghoya"}   ,    {"Hasan","Tetiana"}  };
        //index of 2D array              0                           1

        // print hasan
        System.out.println( names[1][0]);
        //print tetiand
        System.out.println(names[1][1]);
        // assign another name dilsat
        names[1][1] = "Dilsat";
        // print hasan and dilsat
        System.out.println(Arrays.toString(  names[1] ) );
        // print rusht and gosia
        System.out.println(  Arrays.toString(names[0])    );
        // print: 2D array
        System.out.println(    Arrays.deepToString(names)  );

        int[][] numbers = {     {1,2,3}, {4,5,6}, {7,8,9}, {10, 11, 12, 13}       };
        // index                   0        1        2            3

        // 1 2 3 4 5 6 7 8 9 10 11 12
        for(int i = 0; i< numbers.length ; i++) { // checks each index of two dimensional array
            //System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j < numbers[i].length ; j++) { // checks each elements of single array
                System.out.print(  numbers[i][j] + " " ) ;
            }
        }

        System.out.println("\n==========================");
        // print all the even numbers from 2D array
        //                0           1                  2
        int[][] ages = { {10},  {12,13,14,16,17},  {19,20,21,22}  };
        for (int i = 0; i <ages.length ; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                /*
                  another way to do
                  if(ages[i][j] %2 ==0)
                  System.out.print(ages[i][j]+ " ")
                 */
                // if you want to skip specific iteration you can use, continue skip
                if (ages[i][j] % 2 != 0) {
                    continue;
                }
                System.out.print(ages[i][j] + " ");
            }
        }
        System.out.println("\n=========================");
        // how to use foreach loop in the single D array
        int[] arr1D = {1,2,3};
        for(int  each    : arr1D  ){
            System.out.print(each+ " ");
        }
        System.out.println("\n=========================");

        int[][] arr2D = { {10,20,30}, {40,50,60,70,80,90,100} };
        //                     0                1

        // how to print two dimensional array
        System.out.println(Arrays.deepToString(arr2D)  );

        System.out.println("\n..............");

        // how to use foreach loop in the 2 D array
        for(int[]  each1DArray : arr2D) {
            //System.out.println(Arrays.toString(each1DArray));
            for (int eachElement : each1DArray) {
                System.out.print(eachElement + " ");
            }
        }


    }
}
