package day15;

import java.util.Scanner;

public class NameCheckerScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your name please : ");
        String name = scan.next();

        int lengthOfTheName = name.length();
        System.out.println("lengthOfTheName = " + lengthOfTheName);

        if(lengthOfTheName > 4){
            System.out.println("Short name");
        }else if(lengthOfTheName >=4 && lengthOfTheName <=11){
            System.out.println("Medium name");
        }else {
            System.out.println("Longer name");
        }
            if( name.contains("a")  || name.contains("e")   ){
                System.out.println(" name contains a or e ");
            }else{
                System.out.println("I don't have both a or e ");
            }
        }
    }

