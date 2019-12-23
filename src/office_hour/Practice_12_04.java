package office_hour;

import java.util.Scanner;

public class Practice_12_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st word with single character to start with");
        String first = scanner.next();
        char firstAsChar = first.charAt(0);

        System.out.println("Enter 2nd word with single character to start with");
        String second = scanner.next();
        char secondAsChar = second.charAt(0);
        // if we want to include first and last letter between range
        for (   char iChar = firstAsChar ; iChar <=secondAsChar ; iChar++) {
            System.out.print( iChar+ " ");
        }

    }
}
