package day32;

        import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {

        // this is passing the array object directly into the method
        printArrayItems(   new int[] {1,6,5,3,12,3}   );

        // this is assigning the array object into a variable
        // and then pass it into the method
        int[] scores = {2,5,8,23,4,5,6};
        printArrayItems(  scores );
        printMaxOfIntArray( new int[] {4,15,35,21,14});
        printMinOfIntArray(new int[]{6,8,9,1,40});
        printSumOfIntArray(new int[] {10,15,20,4,8,8});
        checkScoresAllMoreThan60(new int[] {95,100,8,90,75});
        compare2arraySize(  new String[]{"Ali,Vehbi,Huseyin,Avni"}, new String[]{"Arraz"}  );
    }
    // printArrayItems
    // create a method that has one int array as a parameter
    // print out each item in this format
    // array has items : --- >> all the items here
    public static  void printArrayItems(int[] nums){
        System.out.println(" array has items : "+ Arrays.toString(nums));
    }

    //printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array
    public static void printMaxOfIntArray(int[] nums){
        int max = nums[0];
        for (int i = 0; i < nums.length ; i++) {
            if(max < nums[i]){
                max = nums[i];
            }
        }
        System.out.println("max = " + max);
    }
    public static void printMinOfIntArray(int[] nums){
        int min = nums[0];
        for (int i = 0; i < nums.length ; i++) {
            if(min > nums[i]){
                min = nums[i];
            }
        }
        System.out.println("min = " + min);
    }
    public static void printSumOfIntArray(int[] nums){
        int sum = 0;
        for (int i = 0; i <nums.length ; i++) {
            sum+= nums[i];
        }
        System.out.println("sum = " + sum);
    }
    // OPTIONALLY
// checkScoresAllMoreThan60
// this method has one int array as parameter
// and it will check whether each and every numbers are more than 60
// if so print everyone passed
// if not print someone has failed
    public static void checkScoresAllMoreThan60(int[] scores ){
        int count = 0;
        for(int eachScore : scores){
            if(eachScore > 60){
                count++;
            }
        } if(count == scores.length){
            System.out.println("everyone passed");
        }else{
            System.out.println("someone has failed");
        }
    }

    public static void compare2arraySize(String[] arr1, String[] arr2){

     if(   arr1.length > arr2.length){
         System.out.println(" array 1 has more item");
     }else if(arr1.length < arr2.length){
         System.out.println(" array 2 has more item");
        }else{
         System.out.println("they have same item count");
     }
    }

}
