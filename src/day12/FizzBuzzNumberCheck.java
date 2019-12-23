package day12;

public class FizzBuzzNumberCheck {
    public static void main(String[] args) {
         // we always start from the more specific condition;otherwise gets error
        // JAVA runs from top to bottom

        int number = 45;
        if( (number % 3) == 0 && (number % 5)==0) {
            System.out.println("FizzBuzz Number");
        }else if( (number % 5) == 0 ){
            System.out.println("Fizz number!");
        }else if((number % 3) == 0){
            System.out.println("Buzz number!");
        }else {
            System.out.println("not my number");
        }

    }
}
