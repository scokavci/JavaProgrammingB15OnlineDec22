package day19;

public class CharAndForLoop {
    public static void main(String[] args) {

        // each character has its corresponding ascii value
        // from ascii table
//        int x = 'A';
//        char myChar = 100 ;
//        System.out.println(x);
//        System.out.println(myChar);
//        char myChar = 101 ;  // e
//        char myChar = 'A';
//        System.out.println(myChar);
//        System.out.println(++myChar);
//        System.out.println(++myChar);
//        System.out.println(++myChar);
//        System.out.println(++myChar);
//        System.out.println('A'  > 'B'); // 65 > 66


        for(   char iChar ='A' ; iChar <='Z'; iChar++   ){
            System.out.print( iChar + " ");
        }
        System.out.println();

        for( char kChar = 'Z' ; kChar >= 'A' ; kChar--){
            System.out.print(kChar + " ");
        }
    }
}
