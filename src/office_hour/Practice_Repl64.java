package office_hour;

public class Practice_Repl64 {
    public static void main(String[] args) {
     String word = "abc";

     int charCount = word.length();

     if(   charCount == 1){
         System.out.println(word + word +word );
     } else if (  charCount == 2) {
         System.out.println( word+ word);
     } else if ( charCount >2){
         // if the word character count is more than 2, I worry about its even or odd number
         if(  charCount%2 == 1){
             int indexOfMiddleCharacter = charCount/2;
             System.out.println(     word.charAt(indexOfMiddleCharacter)  );
         }else{
             int indexOfFirstHalf = charCount/2 -1;
             int indexOfSecodHalf = charCount/2;
             System.out.println(   word.charAt(indexOfFirstHalf)+""+ word.charAt(indexOfSecodHalf));
         }
     }


    }
}

