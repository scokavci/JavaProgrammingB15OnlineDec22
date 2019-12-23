package day27;

public class Multi3DArray_Practice {

    public static void main(String[] args) {

        // Task: print all elements with the space

        int[][][] arr3D = { { {1,2,3}, {4,5,6} }    ,   {{7,8,9},{10,11,12}}     };
        for(int i = 0; i< arr3D.length;i++){   // each index of 2D array
            for (int j = 0; j < arr3D[i].length; j++) { // each index of 1D array
                for (int k = 0; k <arr3D[i][j].length ; k++) { // each index number of values
                    System.out.print(arr3D[i][j][k]+" ");   // returns values
                }
            }
        }

        // homework

        for(int [][] each2D : arr3D){
            for(int [] each1D : each2D){
                for(int eachItem : each1D){
                    System.out.print(eachItem+ " ");
                }
            }
        }
    }
}
