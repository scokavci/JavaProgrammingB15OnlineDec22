package day06;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the minute you want to convert: ");
        int minutes = input.nextInt();
        int hourPart = minutes / 60;
        int minsPart = minutes % 60;
        System.out.println("The minutes "+minutes+" is "
                +hourPart+" hours and " +minsPart+ " minutes");
    }
}
