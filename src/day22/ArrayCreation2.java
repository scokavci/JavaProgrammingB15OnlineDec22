package day22;

public class ArrayCreation2 {
    public static void main(String[] args) {

        // creating an array in second way
        int[] ages = new int[]{3,5,11,33,57,18} ;

        int itemCount = ages.length ;

        System.out.println("itemCount = " + itemCount);
        for (int i = 0; i < itemCount; i++) {
            System.out.println( ages[i]);
        }

        // laziest way to create an array

        int[] areaCodes = { 703, 300, 954, 665};
        for (int i = 0; i < areaCodes.length; i++) {
            System.out.println( areaCodes[i]+ " ");
        }
    }
}
