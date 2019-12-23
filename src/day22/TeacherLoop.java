package day22;

public class TeacherLoop {
    public static void main(String[] args) {

        String msg = "I struggle with Java I like Java I love Everything is Awesome!";

        int charCount = msg.length();
//        System.out.println("Character Count "+ charCount);
//        for (int idx = 0; idx <=charCount -1 ; idx++) {
//          if( idx%2!=0){
//              continue;
//          }
//            System.out.println(idx + "  : "+msg.substring(idx, idx+1));
//        }
//
//        //task2
//        for (int idx = 0; idx <=charCount -1 ; idx++) {
//            // this is code to skip odd number index letters
//            if( idx%2!=0){
//                continue;
//            }
//            String currentChar = msg.substring(idx,idx+1);
//
//            if(currentChar.equalsIgnoreCase("a")){
//               break;
//            }
//            System.out.println("currentChar = " + currentChar);
//        }

        //task 1 and 2

        for (int idx = 0; idx <=charCount -1 ; idx++) {
            if( idx%2!=0){
             continue;
           }
            String currentChar = msg.substring(idx,idx+1);

            if(currentChar.equalsIgnoreCase("J")){
                break;
            }
            System.out.println("currentChar = " + currentChar);
        }

    }
}
