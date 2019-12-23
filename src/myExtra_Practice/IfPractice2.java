package myExtra_Practice;

import java.util.Scanner;

public class IfPractice2 {

    public static void main(String[] args) {

        boolean isWeatherNice = false;

        if(isWeatherNice){
            System.out.println("You can go swimming. ");
        } else{
            System.out.println("Stay home \n Watch movie");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username and Password: ");
        String userName = input.next();
        String password = input.next();

        String validUserName = "superuser";
        String validPwd = "abc123";

        if(userName.equals(validUserName) && password.equals(validPwd)){
            System.out.println("Access granted \n Welcome agent:");
        }else{
            System.out.println("access denied");
        }



    }
}
