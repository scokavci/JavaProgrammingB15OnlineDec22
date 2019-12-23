package reviewClass;

public class Task1 {

    public static void main(String[] args) {

        // given a String with even number character count
        // print 2 characters in one line
        //                 012345678
        // for example  :  Gokyuzum
        /*
            Go  01  (0,2)
            ky  23  (2, 4)
            uz  45  (4, 6)
            um  67  (6, 8)  x =6
         */

          String name = "Gokyuzum";

           int lastIndex = name.length() -1;
           for( int x = 0 ;  x <= lastIndex-1      ;x+=2){
              System.out.println(   name.substring(x,x+2 )  );

          }

    }
}