package day29;

import java.util.Arrays;

public class FillingArrayString {
    public static void main(String[] args) {
      // create an array with size 300 and fill it up with "I Love Java"
        String[] happystr = new String[300];

        //happystr[0] = "1.I Love Java";
        //happystr[1] = "2.I Love Java";

        for (int i = 0; i < happystr.length ; i++) {
              //happystr[i] = (i+1)+".I love Java"; 1. I love Java
              happystr[i] = (i+1)+"I love Java";
        }
        System.out.println(Arrays.toString(happystr));

        String str = new String("ABC"); // this is STRING OBJECT WITH VALUE ABC
        String[] strArr2 = new String[5]; // empty string array with capacity 5
        strArr2[0] = "I love Java";
        strArr2[1] = "I love Java";
        strArr2[2] = "I love Java";
        strArr2[3] = "I love Java";
        strArr2[4] = "I love Java";
        System.out.println(Arrays.toString(strArr2));
    }
}
