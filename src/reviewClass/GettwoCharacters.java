package reviewClass;

public class GettwoCharacters {
    public static void main(String[] args) {
        // given a String with value
        // print 2 characters in one line
        // for example  :01234
        //               Ayra
        /*
           ay : 01  (0,2)
           yr : 12  (1,3)
           ra : 23  (2,4)
        */
        String name = "Ayra";
                        //this should be 2
        for( int x = 0 ; x <= name.length()-2   ; x++){
            System.out.println(      name.substring(x,x+2)   );
        }
    }
}
