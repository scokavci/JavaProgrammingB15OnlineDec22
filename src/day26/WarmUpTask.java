package day26;

import java.util.Arrays;

public class WarmUpTask {
    public static void main(String[] args) {

        int[] nums = {10,40,30,7};
        // I want to assign 3rd item value to sum of first and second item
         nums[2] = nums[0] + nums[1] ;
        System.out.println(nums[2]);

        int temp = nums[0];
        nums[0]= nums[nums.length-1];
        nums[nums.length-1] = temp;
        System.out.println(Arrays.toString(nums));
    }
}
