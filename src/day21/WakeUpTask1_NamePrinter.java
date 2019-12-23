package day21;

public class WakeUpTask1_NamePrinter {
    public static void main(String[] args) {

      String myName = "Sumeyye";
      for( int i = 0 ; i <= myName.length()-1;  i++  ){
          System.out.print(myName.substring(i, i+1) + "->");
      }
//      int charCount = myName.length();
//      int lastCharIndex = charCount -1 ;
//      for(int x = 0 ; x <= lastCharIndex; x++){
//          System.out.print( myName.charAt(x)+"->"  );
//      }
        System.out.println();
        for( int x=0; x< myName.length()-2 ; x++){
            String twoChar = myName.substring(x, x+2);
            System.out.print(twoChar+ "->");
        }

        System.out.println("...............");

        for( int x=0 ; x < myName.length()-3 ;x++){
            System.out.print(myName.substring(x, x+3)+"->");
        }
    }
}


