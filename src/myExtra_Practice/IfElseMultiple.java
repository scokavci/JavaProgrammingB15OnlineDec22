package myExtra_Practice;

import java.util.Scanner;

public class IfElseMultiple {
    public static void main(String[] args) {
        char grade = 'D';

        if(grade == 'A'){
            System.out.println("Excellent");
        }else if(grade == 'B'){
            System.out.println("Good");
        }else if(grade == 'C'){
            System.out.println("not bad");
        }else
            System.out.println("could be better");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your shoe size: ");
        int shoeSize = scan.nextInt(); // int size 6-12
        if(shoeSize > 12){
            System.out.println("We don't have it in the store.");
        }else if(shoeSize >= 6 ){
            System.out.println("We have it in the store");
        }else{
            System.out.println("sorry we don't have it in our store. ");
        }

        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        if(number >= 0 && number <= 100){
            System.out.println(" number is between 0-100");
        }else if(number >= 100 && number <= 1000) {
            System.out.println(" number is between 101 - 1000");
        }else if(number >= 1000 && number <=10000 ){
            System.out.println("number is between 1001 - 10000");
        }else{
            System.out.println(" you number is either negative or more than 10000");
        }
    }
}
