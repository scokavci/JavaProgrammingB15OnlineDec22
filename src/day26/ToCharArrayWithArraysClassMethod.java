package day26;

import java.util.Arrays;

public class ToCharArrayWithArraysClassMethod {

    public static void main(String[] args) {

        String survey = "Complete B15 Online 1 Month Survey";

        char[] surveyChars = survey.toCharArray();
        System.out.println("Before sorting surveyChars:"+Arrays.toString(surveyChars));

        Arrays.sort(surveyChars);
        //System.out.println(surveyChars);
        // you cannot get anything like this. after sorting you have to use .toString to print
        System.out.println("After sorting surveyChars: "+Arrays.toString(surveyChars)  );
    }
}
