package day27;

public class Multi_D_Arrays_Task {
    public static void main(String[] args) {
        int[][] numbers = {{ 12,11,10,19},{19,20,15},{100, 90, 89, 7888} };
        int max = numbers[0][0]; // assume that the first element is max

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(max < numbers[i][j]){ // compares index o of the array with each indexes
                    max = numbers[i][j]; // asigns max number
                }
            }
        }
        System.out.println("max = " + max);
        
        // solution 2
        int max2 = numbers[0][0];
        for( int [] each1DArray : numbers  ){
            for( int eachInt : each1DArray){
                if(max2 < eachInt){
                    max2 = eachInt;
                }
            }
        }
        System.out.println("max2 = " + max2);
        // finding minumum number
        int min = numbers[0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers.length ; j++) {
                if(min > numbers[i][j]){
                    min = numbers[i][j];
                }
            }

        }
        System.out.println("min = " + min);

        System.out.println("=====================");

    }
}
