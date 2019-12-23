package day25;

import java.util.Arrays;

public class FindLongestWordInASentence {
    public static void main(String[] args) {
        // try to find longest word in a sentence
        String sentence = "We all love Java coding intensively";

        String[] allWords = sentence.split(" ");
        System.out.println("allWords = " + Arrays.toString(allWords));

        //first create a String variable longestWord to store my result
        // also create myCharCount variable to store my longest char count
        // I want to go through each and every word in string array
        // and check whether the length of current word is more than longestWord
        // if its I will assign the longest word value to current word I am looking at

        String longestWord = allWords[0];

        for( String currentWord : allWords  ){
            if( currentWord.length() > longestWord.length()){
                longestWord = currentWord ;
            }
        }
        System.out.println(longestWord);





    }
}
