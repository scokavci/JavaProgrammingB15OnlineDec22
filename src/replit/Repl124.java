package replit;

import java.util.Arrays;

public class Repl124 {
    public static void main(String[] args) {
    int [] nums = {4, 3, 2, 44, 1, 100, 55};
//        1. Take values at index 0 and last index and swap them
//        2. Take values at index 0+1 and last index-1 and swap them
//        3. Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)
     int lastIndex = nums.length - 1;  //6
        int midindex = nums.length/2;

        for (int i = 0; i < midindex ; i++) {

            int temp = nums[i];
            nums[i] = nums[lastIndex];//6
            nums[lastIndex] = temp;
            lastIndex--;
        }
//        int temp1 = nums[i];
//        nums[i]= nums[lastIndex-1] ;   //5
//        nums[lastIndex-1] = temp1;
//
//        int temp2 = nums[i];
//        nums[i] = nums[lastIndex-2];
//        nums[lastIndex-2] = temp2 ;    //4

        System.out.println(Arrays.toString(nums));
    }
}
