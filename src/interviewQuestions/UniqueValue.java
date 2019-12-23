package interviewQuestions;

public class UniqueValue {
    public static void main(String[] args) {
        //        1.  Write a program that can print out the unique values from an int Array
//       ** unique definition: occurrence is only ONE TIME APPEARS
//        if arr -> {1,1,2,3,3}
//        output: 2    in this case 2 is unique value because it appears only one time
        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5, 5};  //expected result is 3 only occurred once

        for(int j=0; j < numbers.length; j++) {
            int count = 0;   // find out the number of appearence
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numbers[j]) {
                    count++;   //adds one to to occurence number of 1
                }
            }
            if (count == 1) {   // if the value is unique, then we print out
                System.out.println(numbers[j]);
            }
        }


    }
}
