package day24;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {

        int[]scores1 = {2,5,6,7,3,34,6};
        int[]scores2 = {22,45,6,37,3,6,9};
        int[]scores3 = {2,5,6,7,3,34,6};
        int[]scores4 = {6,5,6,7,3,2,34}; // it has same numbers as 3 but different order

        System.out.println(scores1 == scores2);
        System.out.println(scores1 == scores3);

        // for checking equality of 2 array object content
        // equals --->>> Arrays.equals(scores1,scores2)

        boolean blabla = Arrays.equals(scores1,scores2);
        System.out.println("is score1 has same content as score2  = " + blabla);

        boolean blabla1 = Arrays.equals(scores1,scores3);
        System.out.println("is score1 has same content as score3  = " + blabla1);

        boolean blabla2 = Arrays.equals(scores3,scores4);
        System.out.println("is score1 has same content as score3  = " + blabla2);
        // order is important even though I have same numbers in two objects
        // if order of numbers are different we can not equal them.
        // we can sort them before
        System.out.println("Sorting score 3 and score 4");
        Arrays.sort(scores3);
        Arrays.sort(scores4);
        blabla2 = Arrays.equals(scores3,scores4);
        System.out.println("is score3 has same content as score4  = " + blabla2);
    }
}
