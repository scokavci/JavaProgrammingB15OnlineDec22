package replit;

import java.util.Scanner;

public class Repl87 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int day =0;
        if(inhabitants == 0){
            System.out.println("EXTINCT");
        }else{
            do{
                System.out.println("Day "+day+" "+"["+inhabitants+"]");
                inhabitants = inhabitants /2 ;
                ++day ;
            }while( inhabitants >=1 );
            System.out.println("EXTINCT");
        }
    }
}

