package day26;

public class ArrayTaskNumberTest_Logic2 {
    public static void main(String[] args) {
        // Logic 1.2:
        // take each item check if it is more than 100, increase the count
        // at the end if count is equal to array item count: the final result YES  else no.
        int[] scores = {156, 101, 76, 187, 87, 110};
        String finalResult = "";
        int cntMoreThan100 = 0;
       for( int eachScore : scores){
            if( eachScore > 100){
                cntMoreThan100++;
            }
       }
       if(cntMoreThan100 == scores.length){
           finalResult = "YES";
       }else{
           finalResult = "NO";
       }
        System.out.println("finalResult = " + finalResult);

       // Logic 2.0: early exit false condition
        // fast failure == early exit
        // try out boolean

        int[] scores1 = {156, 101, 76, 187, 87, 110};
        String finalResult1 = "YES"; // why yes because if we have one number less than 100, break out
        for( int eachScore : scores){
            if( eachScore <= 100){
                finalResult1 = "NO";
                break;
            }
        }
        System.out.println("finalResult = " + finalResult);
    }
}
