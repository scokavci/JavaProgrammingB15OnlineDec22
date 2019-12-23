package interviewQuestions;

import java.util.Arrays;

public class Tasks_Muhtar_Aray {
    public static void main(String[] args) {
//
//        1. write a program that can check if a string is build out of the same letters as another string
//        Ex: input:
        //        output:
//        true
        String str1 = "abc", str2 = "cbb"; // // expected result: false
        // I need sort to get order
        //  for sorting I need array
        // to convert a String to Array
        // two ways: split    , toCharArray
        char[] arr1 = str1.toCharArray();  // [a,b,c]
        Arrays.sort(arr1);
        char[] arr2 = str2.toCharArray(); // [c, b, b]
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //   System.out.println(Arrays.equals(arr1,arr2)); array equal method you can use
        str1 = Arrays.toString(arr1);
        str2 = Arrays.toString(arr2);

        System.out.println(str1.equals(str2));

//        2. Write a program that will remove all the duplicated characters from a string
//        Do it with Arrays only
        String s1 = "aaabbaaccbbdd"; // expected result: abcd
        String s2 = ""; // we store non dupplicated characters in it

        for (int i = 0; i < s1.length() ; i++) {
            String eachChar = ""+s1.charAt(i);   // a
            if(!s2.contains(eachChar)){
                s2 += eachChar;
            }
        }
        System.out.println(s2);

        // solution two
        String five5Minutes = "abcabc";
        String[] eachChar = five5Minutes.split(" ");
        String result= ""; // to store all non dupplicated chracters in this string
        for(String each : eachChar){
            if(!result.contains(each)){
                result += each;
            }
        }
        System.out.println( result);

//        3. given the array of names:
        String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
//        write a program that can remove all the names named Ahmed from the array
//        names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
//        System.out.println( Arrays.toString(names) );
//        output:
//	   			[John, Eric, Hassan]
        String nameWithoutAhmed = "";
        for(String eachName : names) {
            if (eachName.equals("Ahmed")) {
                continue;
            } else {
                nameWithoutAhmed += eachName+",";
            }
        }
        String[] namesArr =nameWithoutAhmed.split(",");
        System.out.println( Arrays.toString(namesArr)    );
    }
}


