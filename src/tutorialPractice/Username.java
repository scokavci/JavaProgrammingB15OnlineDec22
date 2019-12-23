package tutorialPractice;

import java.util.Scanner;

public class Username {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username and password");
        String inputUsername = scan.next();
        String inputPassword = scan.next();

        String validUserName = "scokavci";
        String validPassword = "bismillah";

        if(inputUsername.equals(validUserName) && inputPassword.equals(validPassword)){
            System.out.println("Access accepted"+"\n"+"Welcome to the portal");
        }else {
            System.out.println("Access denied");
        }
    }
}
