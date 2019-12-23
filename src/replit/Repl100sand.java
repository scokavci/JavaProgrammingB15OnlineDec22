package replit;

import java.util.Scanner;

public class Repl100sand {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.next();


            int fbreadofLocation = str.indexOf("bread");
            int sbreadofLocation = str.lastIndexOf("bread");

//        System.out.println("fbreadofLocation = " + fbreadofLocation);
//        System.out.println("sbreadofLocation = " + sbreadofLocation);
        if(fbreadofLocation != sbreadofLocation){
            String between = str.substring(fbreadofLocation + 5, sbreadofLocation);

            System.out.println(between);

        } else{
            System.out.println("nothing");
        }

    }
}

