package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {
    public static void main(String[] args) {

       // int[] nums = {13,31,8,5,21,2};
        int[] nums = {2, 5, 8, 13, 21, 31};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        //create a variable called isSortedAlready and assign a value
        // I assume THE ARRAY IS ALREADY SORTED
        // AND IF IT'S NOT THEN I CHANGE the value of isSortedAlready to FALSE
        boolean isSortedAlready = true;
        for (int x = 0; x < nums.length -1; x++) {
            System.out.println(  nums[x] + " "+nums[x+1]);

            // pick first item and compare with second item
            //keep repeating until there is no more item

            // print is item1 is less than item


            System.out.println("is"+ nums[x] +" less than "+nums[x+1]+ "?"+(  nums[x] <nums[x+1])  );
            if( ! (nums[x] < nums[x+1])   ){
                System.out.println("ARRAY IS NOT SORTED, NO POINT CHECKING THE REST");
                isSortedAlready = false ;
                break;
            }
        }
        System.out.println("isSortedAlready = " + isSortedAlready);
    }
}
