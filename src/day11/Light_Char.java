package day11;

public class Light_Char {
    public static void main(String[] args) {
        char targetOption = 'B';
        switch (targetOption) {
            case 'B':
                System.out.println("You turn on bedroom light.");
                break;
            case 'L':
                System.out.println("You turn on living room light.");
                break;
            case 'K':
                System.out.println("You turn on kitchen light.");
                break;
            case 'H':
                System.out.println("You turn on hallway light.");
                break;
            default:
                System.out.println("There is no such a light.");
                break;


        }
    }
}
