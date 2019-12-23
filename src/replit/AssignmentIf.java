package replit;

import java.util.Scanner;

public class AssignmentIf {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number:");
            int a = s.nextInt();
            System.out.println("Enter b number:");
            int b = s.nextInt();


            //WRITE YOUR CODE HERE:

            if(b > a){
                System.out.println(b+" is greater");
            }else{
                System.out.println(a+" is greater");
            }
    }
}
