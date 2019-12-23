package day28;

import java.util.Arrays;

public class ExcelVisualizer2 {
    public static void main(String[] args) {
        int[][] myExcel = {
                {10, 27, 88, 99},  // index 0
                {87, 100},         // index 1
                {90, 45, 65}       // index 2
        };
        // what does deepToString method do:
           // it takes an multiD array and turn it into a String with all items. purpose just to see inside
        // what external data do we provide
          // the multiD array object or multiD array variable
        // what do I get out of it
          // --->>> String representation of multiD array object
        System.out.println(      Arrays.deepToString(myExcel)  );

        for( int[] eachRow     :  myExcel   ){
            for(  int eachCell  : eachRow    ){
                System.out.print( eachCell+ " ");
            }
            System.out.println();
        }
        System.out.println("================");
        for (int i = 0; i < myExcel.length ; i++) {
            for (int j = 0; j < myExcel[i].length ; j++) {
                System.out.print(myExcel[i][j] + " ");
            }
            System.out.println();
        }


    }

}

