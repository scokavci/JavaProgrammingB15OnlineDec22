package day23;

public class WarmUpArray_Teacher {

    public static void main(String[] args) {
        //first way to create an array object

        int[] nums = new int[7] ;
        nums[0] = 11;
        nums[1] = 2;
        nums[2] = 23;
        nums[3] = 4;
        nums[4] = 53;
        nums[5] = 6;
        nums[6] = 3;
        // 2nd way to create an array with the values already filled
        int[] nums2 = new int[]{11, 2, 34, 4, 53, 6, 3};
        //3rd way shortest way
        // this must be assign in one line...important
        int[] nums3 = {11, 2, 34, 4, 53, 6, 3};
        for (int x = nums.length-1; x >=0; x--) {
            System.out.println("item = " + nums[x]);
        }

        int arraySize = nums.length ;
        int lastItemIndex = arraySize -1;
        int lastItemValue = nums[lastItemIndex];

        System.out.println("lastItemValue = " + lastItemValue);

        int middleItemIndex = arraySize/2 ;
        System.out.println("middle item value = " + nums[middleItemIndex]);

        int sum = 0;
        for (int x = 0; x < arraySize ; x++) {
//            int currentItem = nums[x];
//             sum =sum + currentItem ;
               sum = sum + nums[x] ;  // sum+= nums[x] ;
        }
        System.out.println("sum = " + sum);
        
        int max = nums[0] ;
        for (int index = 0; index < nums.length ; index++) {
          if(nums[index] > max){
              max = nums[index];
          }
        }
        System.out.println("max = " + max);
        int min = nums[0] ;
        for (int index = 0; index <nums.length ; index++) {
            if(nums[index] < min){
                min = nums[index] ;
            }
        }
        System.out.println("min = " + min);
        
    }
}
