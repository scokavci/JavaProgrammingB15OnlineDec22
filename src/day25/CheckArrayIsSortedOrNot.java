package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {

        int[] nums = {13,31,8,5,21,2};
        //int[] nums = {1,2,3,4,5,6};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        int numsItemCount = nums.length ;

        //I want to copy the content of nums array into the new array
        // CREATE A NEW ARRAY TO COPY FROM NUMS
        int[]  numsCopy = new int[numsItemCount] ;

        for (int x = 0; x <numsItemCount ; x++) {
            numsCopy[x] = nums[x] ;   //this line is copying nums array items one by one
        }
        System.out.println("Before sort numsCopy = " + Arrays.toString(numsCopy));
        Arrays.sort(numsCopy);
        System.out.println("After sort numsCopy) = " + Arrays.toString(numsCopy));

        if(     Arrays.equals(nums,numsCopy)        ){
            System.out.println("THIS ARRAY IS ALREADY SORTED");
        }else {
            System.out.println("THIS ARRAY IS NOT ALREADY SORTED");
        }

    }
}
