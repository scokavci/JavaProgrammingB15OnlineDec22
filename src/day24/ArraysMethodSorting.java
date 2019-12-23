package day24;

import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {

        int[]scores = {99, 44, 66, 23, 19, 55};
        System.out.println(   Arrays.toString(scores)  );
        System.out.println("original first item value : "+ scores[0]);
        // for sorting an array in ascending order == low to high
        // sort --->>> Arrays.sort(yourArrayHere)
        // modify existing array
        Arrays.sort(scores);
        System.out.println(  Arrays.toString(scores));
        System.out.println("new first item value : " + scores[0]);
        System.out.println("...............character sorting.............");
        char[] nameChars ={'G',' ','d','Z','9','A'};
        System.out.println("before sorting nameChars = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting nameChars = " + Arrays.toString(nameChars) );

        System.out.println("........String Sorting............");
        String[] superHeros = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        System.out.println("before sorting superHeroes = " + Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println("after sorting superHeroes = " + Arrays.toString(superHeros));

        //System.out.println("........boolean Sorting
        // SORT METHOD DOES NOT WORK for boolean Array...........");
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        System.out.println(Arrays.toString(fiveSwitchOnOffs)  );

        //Arrays.sort(arrObject) does not return a value that we can store
        // it only takes action to reshuffle the index of original array object to keep it in sorted order
    }
}
