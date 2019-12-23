package tasksLoop_byTeacher;

import java.util.Scanner;

public class StartEndCharacterLoop {
    public static void main(String[] args) {
        //  HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        // Can we ask user character ? NO!!!!
        // Ask user for String and pick first character by charAt(0)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text");
        String line = scan.next();
        char first = line.charAt(0);

        int len = line.length();
        char last = line.charAt(len - 1);

        for (char ichar = first; first <= last; first++) {
            line = line + first;
        }
        System.out.print(line);
    }
}
