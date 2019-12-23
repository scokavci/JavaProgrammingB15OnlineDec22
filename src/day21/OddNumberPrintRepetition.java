package day21;

public class OddNumberPrintRepetition {

    public static void main(String[] args) {

        // count from 1 to 10
        // print only odd numbers
        //repeat 4 times
        //inside to out

        for (int i = 1; i <=4 ; i++) {
            System.out.println("Iteration: "+i);
            for (int x = 1; x <=10 ; x++) {
                if(x%2 !=0){
                    System.out.print(x);
                }
            }
            System.out.println();
        }
    }
}
