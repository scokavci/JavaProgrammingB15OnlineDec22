package tasksStringby_Teacher;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);           // 0123456789012345678
        System.out.println("Enter a valid URL in the format www.blackfriday.com");
        String url = scan.nextLine();
        int firstdot = url.indexOf(".");
        int firstletter = firstdot+1;
        int lastindex = url.lastIndexOf(".");

        System.out.println(url.substring(firstletter,lastindex));

    }
}
