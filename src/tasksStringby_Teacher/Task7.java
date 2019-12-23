package tasksStringby_Teacher;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
//        Ask user to enter valid email address
//        for example :
//        JSnow@NightWatch.com or
//        Arya@KingsLanding.edu
//        print 3 part of the email separately
//        for example :
//        Part1 -> JSnow  Part2 -> NightWatch Part3 ->com
//        Part1 -> Arya   Part2 -> KingsLanding Part3 ->edu
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter valid email address");
        String email = scan.nextLine();

        int i = email.indexOf("@");
        String firstPart = email.substring(0,i);
        int j = i+1;
        int dot = email.indexOf(".");
        String secondPart = email.substring(j,dot);

        int l = dot+1;
        String thirdPart = email.substring(l);
        System.out.println( "Part1 -> "+firstPart+ " Part2 -> "+secondPart+ " Part3 -> "+thirdPart);

    }
}
