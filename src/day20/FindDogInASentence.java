package day20;

public class FindDogInASentence {
   // given a sentence , find out the location of the dog
    // our approach is doing through the sentence 3 character at a time
    // then if 3 characters happen to be a dog , we print out index
    //
    // I like Dog , Dogs are cute , Dogs are friendly
    public static void main(String[] args) {
                  //  0123456789012345678901234567890123456789012345
        String msg = "I like Dog , Dogs are cute , Dogs are friendly";
        int lastCharIndex = msg.length()-1 ;

        for ( int x = 0 ; x<=lastCharIndex -2 ; x++){

            String current3chars = msg.substring(x, x+3);

           // System.out.println( msg.substring(x, x+3)   );
            //System.out.println(x + ":"+ current3chars );

            if (current3chars.equals("Dog")){
                System.out.println("BINGO !!!! AT "+ x);
            }
        }
    }
}
