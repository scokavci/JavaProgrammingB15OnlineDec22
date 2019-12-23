package day10;

public class Calculator_v1 {
    public static void main(String[] args) {
        char operator = '+';
      // this case is equivalent of saying if (operator == +-*/)
        switch(operator){
            case '+':
                System.out.println(" you are about to add numbers" );
                break;
            case '-':
                System.out.println( " you are about to subtract numbers" );
                break;
            case '*':
                System.out.println(" you are about to multiply numbers" );
                break;
            case '/':
                System.out.println( " you are about to divide numbers" );
                break;
            default:
                System.out.println("INVALID OPERATOR!!!");
                break;

        }
    }
}
