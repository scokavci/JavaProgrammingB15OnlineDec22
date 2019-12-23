package office_hour;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_12_10_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 languages that you know");
        String l1 = scan.next();
        String l2 = scan.next();
        String l3 = scan.next();
      // I want to collect 3 languages and store them into one array

        String[] languages = {l1,l2,l3};
                    //        0  1  2
        System.out.println(languages[1]);

        //1. method to print all values
        System.out.println(Arrays.toString(languages));

        //2. method for each loop
        for(String lan : languages){
            System.out.println("Here is the language: "+ lan);
        }

        //3.method to print for loop

        for(int languageIndex = 2 ; languageIndex >=0 ; languageIndex--){
            System.out.println(languages[languageIndex]);
        }
    }
}
