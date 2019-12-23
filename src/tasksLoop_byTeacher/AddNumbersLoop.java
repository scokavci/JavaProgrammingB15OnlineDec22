package tasksLoop_byTeacher;

import java.util.Scanner;

public class AddNumbersLoop {
    public static void main(String[] args) {
        // Homework
        // Create a program to
        // ask user two number and
        // add numbers within those range

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scan.nextInt();
        int endNumber = scan.nextInt();
        int sum = 0;
        
        for( int startNumber = num1 ; startNumber <= endNumber ; startNumber++){
            System.out.println(startNumber);
             sum = sum + startNumber ;
        }
        System.out.println("sum = " + sum); 
    }
}
