package tasksLoop_byTeacher;

import java.util.Scanner;

public class Shazam {
    public static void main(String[] args) {

        /*
        * Write a program to
        * repeatedly ask user for keyword to turn into super hero
        * unless user say SHAZAM! in case insensitive manner
        * program will keep asking
        * and when you user enter Shazam! it will print you are now Super Hero!
        *
        hint : use do while loop
        * */
        Scanner scan =new Scanner(System.in);
        String keyword = " ";

        do{
             System.out.println("Enter a keyword that turns into a hero");
             keyword = scan.nextLine();
        }while(  ! keyword.equals("Shazam!"));
        System.out.println("you are now a Super Hero!");
    }
}
