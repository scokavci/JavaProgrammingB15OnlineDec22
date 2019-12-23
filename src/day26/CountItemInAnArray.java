package day26;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {
        String[] marvelHeros = {"Iron Man", "Capitan America", "Spiderman",
                                "Black Panther", "Hulk", "Capitan America", "Spiderman",
                                "Capitan America", "Spiderman",
                                "Black Panther", "Hulk", "Capitan America", "Spiderman"};
        System.out.println("Marvel Heros ="+ Arrays.toString(marvelHeros)   );
        // give a word and search and count how many this word in the string
        int sizeOfArray = marvelHeros.length ;
        System.out.println("Hero Count = " + sizeOfArray);
        String itemSearch ="Black Panther";
        int countOfItem = 0;

        for(String eachHero : marvelHeros){
             if( eachHero.equals(itemSearch)){
                 countOfItem++ ;
             }
        }
        System.out.println("countOfItem = " + countOfItem);
        
        // COUNT THE HERO WITH THE NAME CONTAINS BLACK
        int countOfBlack = 0;
        for(String eachHero : marvelHeros){
            // make eveything lowercase then check. ignorecase doesnot work because two words Iron Man.check only one
            // "ignore Man".equalsIgonoreCase("ignore")  // not same thing can not be equal
            if(eachHero.toLowerCase().contains("Black")){
                countOfBlack++;
            }
        }
        System.out.println("countOfBlack = " + countOfBlack);

       String longestWord = marvelHeros[0];
        for(String eachWord : marvelHeros) {
            if (eachWord.length() > longestWord.length()) {
                longestWord = eachWord;
            }
        }
        System.out.println("longestWord = " + longestWord);

    }
}
