package day21;

public class SearchingSomethingInString {
    public static void main(String[] args) {
        // find out index of all the letter a in cases insensitive manner
        //I will go through each and every letter of String  -->> loop
        //     -->>> each character i can use substring(0,1) and so on
        //     -->> going to 0 to last index -- >> for loop
        // while I am going through each and every character
        //I will check whether current character I am looking at
        // equals to a or A -->>> currentCharacter.equalsIgnoreCase("a")
        //if it is I will print index -->> println()
        // if not -->> just move on
        //perform this action until I reach last character: if I go over last character index i stop

        String myName = "Daria Ozer";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        System.out.println("---1 char ---");
        int countOfA=0;
        //for (int x = 0; x < charCount ; x++) {
        for (int x = 0; x <= lastCharIndex; x++) {
           String currentChar = myName.substring(x, x+1);
           if(currentChar.equalsIgnoreCase("a")){
               System.out.println("The index of a or A is "+ x);
               countOfA++;
               System.out.println("countOfA = " + countOfA);
           }
        }
    }
}
