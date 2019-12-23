package reviewClass;

public class FindDog {

    public static void main(String[] args) {

       //         01234567890123456789012345678901234567890123456
        //        I li*ke*Dog , Dogs are cute , Dogs are friendly
        // when dog is found , prt index

        String msg = "I like Dog , Dogs are cute , Dogs are friendly";
         int countDog=0;
        for( int x = 0 ; x<= msg.length()-3 ; x++) {
          String current3Char = msg.substring(x,x+3);
          if(current3Char.equals("Dog")){
              System.out.println("Bingo at "+ x);
               countDog++;
              System.out.println("countDog = " + countDog);
          }
        }
    }
}
