package day07;

public class RelationalOperator_Variable {
    public static void main(String[] args) {
        // > >= < <= == !=
        // Relation operator is used to compare 2 numbers
        //and return true or false
        //anything action or expression
        // that return true or false
        // can be called boolean expression
         int myNumber = 10;
        System.out.println(myNumber > 5);
        System.out.println(myNumber < -19);
        System.out.println(myNumber >= 5);
        System.out.println(myNumber>= 8);
        System.out.println(myNumber <= 5);
        System.out.println(myNumber >= 8);

        // == is used to check for equality
        // AND VERY DIFFERENT FROM SINGLE =
        //difference between == and = same as difference between equal and equality in daily English
        System.out.println(myNumber == 5);

        // != is used to check for inequality, ! means in java NOT
        System.out.println(myNumber != 10);
        System.out.println(myNumber != 6);

       // == and != are questions  , checking for equality or inequality
    }
}
