package day12;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter userName and password:");
        String userName = scan.nextLine();
        String password = scan.nextLine();

        //we can declare and assign value on the same line
        //String userName="scokavci", password="pass123";

        String correctUserName = "user123", correctPassword = "pass123";

        if( userName.equals(correctUserName) && password.equals(correctPassword)){
            System.out.println("Log In Successful");

        } else if ( !userName.equals(correctUserName) && password.equals(correctPassword)){
            System.out.println("Username Not Correct");

        }else if(userName.equals(correctUserName)  && ! password.equals(correctPassword)){
            System.out.println("Password Not Correct");
        }else if(!userName.equals(correctUserName) &&!password.equals(correctPassword) ){
            System.out.println("Both Password and Username NOT CORRECT");}
}
}