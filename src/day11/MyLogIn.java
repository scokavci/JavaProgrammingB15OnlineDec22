package day11;

import java.util.Scanner;

public class MyLogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username and password: ");
        String username = scan.nextLine();
        String password = scan.nextLine();
        String myUserName = "scokavci";
        String myPassword = "Bismillah";

        if( username.equals(myUserName) && password.equals(myPassword)    ){
            System.out.println("Access accepted"+"\n"+"Welcome to your account page");
        } else{
            System.out.println("Access denied. Please try again!");
        }
    }
}
