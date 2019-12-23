package day20;

public class SumOffOdd {
    public static void main(String[] args) {
       // where to I store ask then create a variable
        int sum = 0;
        int countOfOdd = 0;
        for (int i = 10; i <=100 ; i++) {
            if( i%2 != 0){
                sum += i;
               // System.out.print( i+ ",");
                ++countOfOdd ;
            }
        }
        System.out.println();
        System.out.println(countOfOdd);
        System.out.println("sum = " + sum);
    }
}
