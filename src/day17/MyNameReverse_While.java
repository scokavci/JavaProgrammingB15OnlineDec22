package day17;

public class MyNameReverse_While {

    public static void main(String[] args) {
                      // 0123456
        String myName = "Sumeyye Cokavci";

        int x = myName.length() - 1 ;  // last index of string

        while( x >= 0 ){
            System.out.println( "index "+ x +" :" + myName.charAt( x ) );
            -- x;
        }
    }
}
