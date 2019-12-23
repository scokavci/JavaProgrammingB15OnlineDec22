package day22;

public class LoopingThroughAnArrayReverse {
    public static void main(String[] args) {

        int [] scores = new int[4] ;

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        int itemCount = scores.length ;

        for (int i = itemCount-1; i >=0; i--) {
            System.out.println("Index location "+i);
            System.out.println(scores[i]);
        }
    }
}
