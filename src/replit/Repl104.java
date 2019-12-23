package replit;

import java.util.Scanner;

public class Repl104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();

        json = json.replace(" ", "");

        int fstart = json.indexOf("firstName") + 12;
        int ffinish = json.indexOf("\", \"lastName");

        int lstart = json.indexOf("lastName") + 12;
        int lfinish = json.indexOf("\",\"role");


        System.out.println("First name: " + json.substring(fstart, ffinish));
        System.out.println("Last name: " + json.substring(lstart, lfinish));
    }
}

