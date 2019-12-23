package myExtra_Practice;

public class Char_Switch {
    public static void main(String[] args) {

        char option = 'C';
        switch(option){
            case 'A' :
                System.out.println("You selected A .");
                break;
            case 'B':
                System.out.println("You selected B .");
                break;
            case 'C':
                System.out.println("You selected C .");
                break;
            default:
                System.out.println("INVALID ENTRY");
                break;
        }
    }
}
