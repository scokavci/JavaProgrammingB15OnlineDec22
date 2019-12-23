package replit;

import java.util.Scanner;

public class SecondConverter {

    public static void main(String[] args) {
        //YOUR CODE HERE:

        Scanner scanner = new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds;
        System.out.println("Enter seconds:");

        inputSeconds = scanner.nextInt();

        hours = inputSeconds / 3600;
        int seconds1 = inputSeconds % 3600;

        minutes = seconds1 / 60;

        seconds = seconds1 % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}
