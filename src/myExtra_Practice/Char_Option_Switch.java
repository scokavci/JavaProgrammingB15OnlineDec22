package myExtra_Practice;

public class Char_Option_Switch {
    public static void main(String[] args) {

        char option = 'B';
        switch (option) {
            case 'A':
                System.out.println("A is correct.");
                break;
            case 'B':
            case 'C':
                System.out.println("try to watch");
                break;
            case 'D':
                System.out.println("Incorrect answer");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}
