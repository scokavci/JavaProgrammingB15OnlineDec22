package day11;

public class LogicalNonOperator {
    public static void main(String[] args) {

        // LOGICAL NOT OPERATOR ! exclamation mark used to negate boolean value
        //System.out.println( true );
        //System.out.println(  false );
        //1st of use: boolean value like true or false
        System.out.println("Result of !true -->> ");
        System.out.println( !true );
        System.out.println("result of !false -->> ");
        System.out.println(!false );
      //2nd use : front of boolean variable
        boolean isRecording = false;
        System.out.println( ! isRecording);
        //3rd use: in front of boolean expression
        //example  7>5   , x >10, y==10, x < = 100, x > 10 && x < 100
        System.out.println("The result of !7>5 is ");
        System.out.println( !( 7 > 5)  );

        int x = 7;
        System.out.println("The result of !(x>10)");
        System.out.println(   !(x>10));
    }
}
