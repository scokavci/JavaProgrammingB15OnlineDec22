package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {
        int total =0;
        //from 1 to 100
        // count how many numbers divisible
        int counter = 0;

        for( int i =1 ; i<=100 ; i++){
            if( i%15 == 0 ){
                System.out.print(i+ " ");
                ++counter ;
            }
        }
        System.out.println();
        System.out.println("counter = " + counter);
    }
}
