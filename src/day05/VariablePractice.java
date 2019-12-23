package day05;

import javax.crypto.spec.PSource;

public class VariablePractice {

    public static void main(String[] args) {

        //8 primitive data types
        /*
          Block comment, everything is between will seen as comment
          whole numbers: byte, short, int, long
          fractional numbers : float, double
          logical : boolean (true , false)
          character : char (unicode, single character IN SINGLE QUOTE)
          USUALLY BY DEFAULT for whole numbers : just use int
          USUALLY BY DEFAULT for fractional numbers : just use double

          IS STRING part of Primitive types? : NOOOOO!!!!
          STRING is sequence of character
        */
        // age calculator
        // given birth year , please calculate the age
        int birthYear = 2001;
        int currentYear = 2019;
        int age = currentYear - birthYear;

        // I was born in year 2001, and I am 18 years old;
        //System.out.println(" I was born in year " + 2001 +"  , and I am" + (2019 = 2001) + "years old");
        System.out.println(" I was born in year " + birthYear +"  , and I am " + age + " years old");

        //Task 2: you are speeding today
        //speed limit is some number, and your current speed is this
        // generate this output of
         int mySpeed = 75;
         int speedLimit = 45;
         int overThelimit = mySpeed - speedLimit;

         System.out.println("You are driving " + overThelimit + " mph more than speed limit.");


    }
}
