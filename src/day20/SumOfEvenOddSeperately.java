package day20;

public class SumOfEvenOddSeperately {
    public static void main(String[] args) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int countOfOdd = 0;
        int countOfEven = 0;

        for (int i = 10; i <=100 ; i++) {
            if( i%2 != 0){
                sumOfOdd += i;
                ++countOfOdd ;

            }else if( i%2 == 0){
                sumOfEven += i;
                ++countOfEven ;
            }
        }
        System.out.println("countOfOdd = " + countOfOdd);
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("countOfEven = " + countOfEven);
        System.out.println("sumOfEven = " + sumOfEven);
    }
}
