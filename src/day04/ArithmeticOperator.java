package day04;

public class ArithmeticOperator {

    public static void main(String[] args) {
        //System.out.println(5 + 3);  //8
       // System.out.println(5 - 3);  //2
       // System.out.println(5 * 3);  // 15
        //System.out.println(5 / 3);  // 1
        // arithmetic operator between two int -- >> another int
        // arithmetic operator between numeral data type
        // the final result will be larger data type
      //  System.out.println(5 + 3.0d);  //8.0
      //  System.out.println(5 - 3.0d);  //2.0
     //   System.out.println(5 * 3.0d);  // 15.0
       // System.out.println(5 / 3.0d);  // 1.666666666666667
       // System.out.println(5 / 3.0f);  // 1.666667

        //store above numbers in variables
        //and replace above statements with variables instead
        // dataType result1 = the calculation here
        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;

        double sum = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        float division1 = num1 / num3;

         System.out.println(sum);
         System.out.println(subtraction);
         System.out.println(multiplication);
         System.out.println(division);
         System.out.println(division1);


    }
}
