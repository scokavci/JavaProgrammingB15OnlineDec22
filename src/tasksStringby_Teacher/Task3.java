package tasksStringby_Teacher;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
//        Task 3:
//        Ask user to enter full name
//        assuming full name is 2 word
//        Write a program to print users initials
//        for example :
//        Jon Snow -->> Initial is JS
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Full Name: ");
        String fullName = input.nextLine();

        fullName = fullName.toUpperCase();

        int i = fullName.indexOf(" ");
        int j = i+1;
        System.out.println( fullName.charAt(0)+ ""+ fullName.charAt(j)    );

    }
}
