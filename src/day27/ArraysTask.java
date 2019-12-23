package day27;

public class ArraysTask {
    public static void main(String[] args) {
        // Task02:
        // write the program that can find the minimum number from an int array
        // don't use sort method
        
        int[] scores = {100,897,654,32,1231,224,556, 7,1,2,3,4};
//       one way of solving 
//        int min = scores[0];
//        for(int eachScore : scores){
//            if( eachScore < min){
//                min = eachScore ;
//            }
//        }
//        System.out.println("Min number = " + min);
        
        // another way to solve
        int min = scores[0] ;
        for (int i = 0; i < scores.length; i++) {
            if(min > scores[i]){
                min = scores[i];
            }
        }
        System.out.println("Minimum number = " + min);
        
        int secondMin = scores[0];
        for (int i = 0; i < scores.length ; i++) {
            if (scores[i] == min) {
                continue;
            }
            if(secondMin > scores[i]) {
                secondMin = scores[i];
            }
        }
        System.out.println("Second Minimum Number = " + secondMin);
        
        int thirdMin = scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i] == min || scores[i] == secondMin){
                continue;
            }
            if(thirdMin > scores[i]){
                thirdMin = scores[i];
            }
        }
        System.out.println("Third minimum number = " + thirdMin);
    }
}
