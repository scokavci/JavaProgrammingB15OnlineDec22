package day22;

public class LoopingThroughAnArray {
    public static void main(String[] args) {


        int [] scores = new int[4] ;

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        // how do we get the size of any array object
        // array object has a property called length
        int itemCount = scores.length ;

        for (int i = 0; i < itemCount  ; i++) {
            System.out.println(scores[i]);
        }

        // how do we get the char account of a string
        String name = "Jon Snow";
        int charCount = name.length();
    }
}
