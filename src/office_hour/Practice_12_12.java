package office_hour;

import java.util.Arrays;

public class Practice_12_12 {
    public static void main(String[] args) {
//        1.  Write a program that can print out the unique values from an int Array
//       ** unique definition: occurrence is only ONE TIME APPEARS
//        if arr -> {1,1,2,3,3}
//        output: 2    in this case 2 is unique value because it appears only one time
        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5, 5,6,7,8,9};  //expected result is 3 only occurred once
        for(int j=0; j < numbers.length; j++) {
            int count = 0;   // find out the number of apperence
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numbers[j]) {
                    count++;   //adds one to to occurence number of 1
                }
            }
            if (count == 1) {   // if the value is uniue, then we print out
                System.out.println(numbers[j]);
            }
        }
//        2. Write a program that can print out the unique values from  String Array
//        if arr -> {"a" , "a ", "b", "c", "c"}            output: b
          String[] array = {"A","A","B","C","C"};
        for(int j=0; j < array.length ; j++) {
            int count2 = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(array[j])) {
                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(array[j]);
            }

        }
//        3. Write a program that can find the second max number from an int array
//        DO NOT use sort method
        int[] grades = {1,2,3,4,5,6,7,8};
        int max = grades[0];

        for(int eachGrade : grades) {
            if (eachGrade > max) {
                max = eachGrade;
            }
        }
        System.out.println(max);
        int secondMax = grades[0];
        for(int eachGrade : grades){
            if(eachGrade==max ){
                continue;
            }
            if(eachGrade> secondMax){
                secondMax = eachGrade;
            }
        }
        System.out.println(secondMax);
//        4. Swap two variable' values without using a temporary variable
//        if a =10, b= 20;
//        output: print( a ) ==> 20
//        print( b ) ==> 10
        int a = 10 , b = 20 ;
        a = a+b;   //30
        b = a-b;   //10
        a = a-b;   //20
        System.out.println(a+" "+b);

    }
}
