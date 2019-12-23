package day20;

public class WorkingWithMoreThanOneCharInString {

    public static void main(String[] args) {

        // give a String with even number character count
        // print 2 characters in one line
        //               01234567
        // for example : Gokyuzum
        /*
        Go  01   (0,2)
        ky  23    (2,4)
        uz  45   (4,6)
        um  67   (6.8)    0,2,4,6,8 = 8 is character count
         */

//        System.out.println(  name.substring(0,2)   );
//        System.out.println(  name.substring(2,4)   );
//        System.out.println(  name.substring(4,6)   );
//        System.out.println(  name.substring(6,8)   );

//        int x = 0;
//        System.out.println(  name.substring(x, x+2)   );
//        x = x+2 ;
//        System.out.println(  name.substring(x, x+2)   );
//        x = x+2 ;
//        System.out.println(  name.substring(x, x+2)   );
//        x = x+2 ;
//        System.out.println(  name.substring(x, x+2)   );
//        x = x+2 ;

        // my condition is x <=charcount-2
        String name = "Gokyuzum";
        int charCount = name.length();
        int lastCharIndex = charCount -1 ;


        for( int x = 0 ; x <=lastCharIndex - 1 ; x+=2){
            System.out.println( name.substring( x,x+2));
        }

    }
}
