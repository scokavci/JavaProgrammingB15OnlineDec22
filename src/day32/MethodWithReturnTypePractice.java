package day32;

import jdk.swing.interop.SwingInterOpUtils;

public class MethodWithReturnTypePractice {
    public static void main(String[] args) {

        System.out.println(  divide(10,3) );
        System.out.println(  divide(10,0) );
        System.out.println(  divide(0,10) );
    }


    // create a method called divide
    // it has two double parameters and return the result as double
    public static double divide(double num1, double num2){
        // to avoid to get the result we did not wanted
        // in java we can not dive any number divided by ZERO is ERROR.
        if(num2==0){
            return 0.0;  // we don't want to get error that's why we assign zero
        }else {
             return num1/num2;
        }
    }
}
