package day17;

import java.util.Scanner;

public class FullNameCorrector_Scanner {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName = scan.nextLine();
        int indexOfSpace = fullName.indexOf(" ");

        String firstName = fullName.substring(0,indexOfSpace);
        String lastName =  fullName.substring(indexOfSpace + 1);

        String firstNameCorrected = firstName.toUpperCase().substring(0,1);
               firstNameCorrected += firstName.toLowerCase().substring((1));
        System.out.println("firstNameCorrected = " + firstNameCorrected);

        String lastNameCorrected = lastName.toUpperCase().substring(0,1);
               lastNameCorrected += lastName.toLowerCase().substring(1);
        System.out.println("lastNameCorrected = " + lastNameCorrected);

        System.out.println(   firstNameCorrected +" "+ lastNameCorrected);
    }
}
