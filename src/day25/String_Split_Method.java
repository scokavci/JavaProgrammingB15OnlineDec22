package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {

        String sentence = "I love Java";
        // WHAT DOES IT DO?
        // split(bysomething) is a method of String that turn string into multiple part
        //Do I need to provide extra data while calling the method?
        // YES, we need to tell what do we use while splitting, in this example space
        // what do I get out of it?
        // We get out String array

        String[] allWords = sentence.split(" ");
        System.out.println("allWords = " + Arrays.toString(allWords)  );
        System.out.println("How many word do I have in this sentence ? :"+ allWords.length);

        // how do I get the last word of the sentence using this array I got from string
        System.out.println("Last word in this sentence is: "+ allWords[  allWords.length-1]);

        // ARE WE LIMITED TO SPLIT BY SPACE OR WE CAN SPLIT BY ANYTHING ? -->> ANYTHING

        String sentence2 = "Everyhting is Awesome !!!";
        //split by letter e  ...basically cut letter e and print

        String[] splitBy_e_Arr = sentence2.split("e");
        System.out.println("splitBy_e_Arr = " + Arrays.toString(splitBy_e_Arr));

        for(String eachPieces : splitBy_e_Arr){
            System.out.println("eachPieces = <" + eachPieces+ ">");
        }

        String[] splitBy_Awe = sentence2.split("Awe");

        System.out.println("splitBy_Awe = " + Arrays.toString(splitBy_Awe));

        for(String eachPieces : splitBy_Awe){
            System.out.println("eachPieces = " + eachPieces);
        }
    }
}