package office_hour;

import java.util.Scanner;

public class Practice_12_02_2 {
    public static void main(String[] args) {
        //             01234567890
        //String name = "Zehra Aygun";
      Scanner scan = new Scanner(System.in);
        // getting each character using charAt(index)
        // generate sequential number 0 --->> 10
        System.out.println("Enter a name: ");
        String name = scan.nextLine();
        int num = 0;
        while(  num < name.length() ){
            System.out.print( name.charAt(num) );
            ++ num ;
        }
    }
}
