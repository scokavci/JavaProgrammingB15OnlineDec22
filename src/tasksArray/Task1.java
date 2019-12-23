package tasksArray;

public class Task1 {
    public static void main(String[] args) {

//        create an int array of 6 elements and find out
//        average of the array
//        sum of all elements
//        sum of even numbers in the array
//        sum of odd numbers in the array
//        max number in the array
//        min number in the array

        int[] nums = {18,4,20,15,35,70};

        for (int x = 0; x < nums.length; x++) {
            System.out.print( nums[x]+" ");
        }
//        System.out.println();
//        for (int x = nums.length-1; x >= 0; x--) {
//            System.out.print( + nums[x]+ " ");
//        }
//        System.out.println();
//        int middleItem = nums[nums.length/2] ;
//        System.out.println("middleItem = " + middleItem);
//        System.out.println();
        int sum = 0;
        for (int x = 0; x < nums.length ; x++) {
            sum += nums[x] ;
        }
        System.out.println("sum = " + sum);
        System.out.println();
        int max = nums[0];
        for (int x = 0; x < nums.length; x++) {
            if( max < nums[x]){
                max = nums[x];
            }
        }
        System.out.println("max = " + max);
        System.out.println();
        int min = nums[0] ;
        for (int x = 0; x <nums.length ; x++) {
            if ( min > nums[x]) {
                 min = nums[x];
            }
        }
        System.out.println("min = " + min);
        System.out.println();

        int itemscount = nums.length ;

        int average = (sum/itemscount) ;
        System.out.println("average = " + average);
        System.out.println();
         int sumEven = 0;
        for (int x = 0; x < nums.length ; x++) {
            if(nums[x] %2 == 0){
               sumEven += nums[x] ;
            }
        }
        System.out.println("sum of even numbers = " + sumEven) ;
        System.out.println();
        int sumOdd = 0;
        for (int x = 0; x < nums.length; x++) {
            if(nums[x] %2!=0){
                sumOdd += nums[x] ;
            }
        }
        System.out.println("sumOdd = " + sumOdd);
    }
}
