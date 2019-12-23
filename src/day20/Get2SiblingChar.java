package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {

        // give a String with even number character count
        // print 2 characters in one line as below example
        //               0123
        // for example : Ayra
        /*
        Ay  01   (0,2)
        yr  12   (1,3)
        ra  23   (2,4)
        */
        String name = "Ayra";
        int charCount = name.length();
        int lastCharIndex = charCount -1 ;

        for( int x = 0 ; x <=lastCharIndex - 1 ; x++){
            System.out.println( name.substring( x,x+2));
        }
         /*   name : Ayra
        Ayr  012   (0,3)
        yra  123   (1,4)

        */
        for( int x = 0 ; x <=lastCharIndex - 2 ; x++){

            System.out.println( name.substring( x,x+3));
        }

        }

    }
