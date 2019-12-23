package day07;

import jdk.swing.interop.SwingInterOpUtils;

public class CastingTheCharacter {
    public static void main(String[] args) {

        char grade ='B';
        System.out.println(grade);
//   B is represented by 66 in ASCII table
//   here type char is automatically widened to int
//        and stored as number
        int letterInNumber = 'B';
        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

      // ---------------------------------------------

        char myFirstChar = (char) 100;
        System.out.println(myFirstChar);

        char letterA = 'a';
        // adding a character to int number will result in
        // (int) letterA +1
        System.out.println(letterA + 1);

        System.out.println(" " +letterA + 1);
    }
}
