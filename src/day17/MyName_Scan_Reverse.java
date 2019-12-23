package day17;

import java.util.Scanner;

public class MyName_Scan_Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name =scan.nextLine();
        int index = name.length() - 1;   //last index

        while( index >= 0 ){
            System.out.println( "x "+ index +" :" + name.charAt(index));
            -- index;
        }
    }
}
