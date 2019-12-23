package myExtra_Practice;

public class Char_Option_IfElse {
    public static void main(String[] args) {
        char option = 'D';

        if(option == 'A'){
            System.out.println("A is correct. ");
        }else if(option =='B' || option == 'C'){
            System.out.println("try watch tutorial 15-18.");
        }else if(option == 'C'){
            System.out.println("Incorrect answer");
        }else{
            System.out.println("Invalid entry.");
        }
    }
}
