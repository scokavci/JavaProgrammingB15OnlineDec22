package replit;

import java.util.Scanner;

public class Repl78 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        int first = message.indexOf("<");
        int last = message.indexOf(">");
        sender = message.substring(first+1,last);
        System.out.println("Sender: " + sender);

        int squarefirst = message.indexOf("[");
        int squarelast = message.indexOf("]");
        phoneNumber = message.substring(squarefirst +1 , squarelast);
        System.out.println("Phone Number: " + phoneNumber);

        int msgfirst = message.indexOf("{");
        int msglast = message.indexOf("}");
        messageBody = message.substring(msgfirst +1 , msglast);
        System.out.println("Message body: " + messageBody);
    }
}
