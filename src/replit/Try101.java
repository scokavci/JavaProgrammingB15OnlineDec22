package replit;

import java.util.Scanner;

public class Try101 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countOfJava = 0;
        int countOfPython = 0;

        for( int x = 0 ;x <= sentence.length()- 4;x++) {

            String findJava = sentence.substring(x, x + 4);
            if (findJava.equalsIgnoreCase("java")) {
                ++countOfJava;
            }
        }   for( int x = 0 ;x <= sentence.length()- 6;x++){
                String findpython = sentence.substring(x,x+6);
                if(findpython.equalsIgnoreCase("python")  ){
                ++countOfPython ;
                }
            }
            if(countOfPython == countOfJava){
            System.out.println("true");
            }else{
            System.out.println("false");
            }
}
}
