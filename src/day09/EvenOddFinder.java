package day09;

public class EvenOddFinder {
    public static void main(String[] args) {

        int myNumber = 301;
        int remainder = myNumber % 2;
        System.out.println(myNumber/2);
        System.out.println(myNumber%2);

       // if(remainder == 0){
        if(myNumber%2 == 0){
            System.out.println("This is even number. ");
        }else {
            System.out.println("This is odd number.");

        }

    }
}
