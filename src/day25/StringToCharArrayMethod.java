package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {
        String name= "Alesya";

        // first method to create char array:
                                      //charactercount
        char[] namesChars = new char[  name.length() ]; // { , , , , , ,}

        for (int x = 0; x < namesChars.length; x++) {
            namesChars[x] = name.charAt(x);
        }
        System.out.println("namesChars = " + Arrays.toString(namesChars));

        //................................................................

        //second method to create char array:
        // with using .toCharArray() String method
        char[] namesChar2 = name.toCharArray();
        System.out.println("namesChars2 = " + Arrays.toString( namesChar2 ))  ;
    }
}
