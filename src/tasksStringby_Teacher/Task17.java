package tasksStringby_Teacher;

public class Task17 {
    public static void main(String[] args) {

        String name = "I love Java I love Java Java Java";

        int firstspacelocation = name.indexOf(" ");
        String firstWord = name.substring(0, firstspacelocation);
        System.out.println("firstWord = " + firstWord);

        int secondspacelocation = name.indexOf(" ", firstspacelocation + 1);
        String secondWord = name.substring( firstspacelocation +1 , secondspacelocation);
        System.out.println("secondWord = " + secondWord);

        int thirdspacelocation = name.indexOf( " ", secondspacelocation + 1);
        String thirdWord = name.substring(   secondspacelocation + 1, thirdspacelocation  );
        System.out.println("thirdWord = " + thirdWord);
        
        int fourthspacelocation = name.indexOf(" ", thirdspacelocation + 1     );
        String fourthWord = name.substring( thirdspacelocation + 1 , fourthspacelocation  );
        System.out.println("fourthWord = " + fourthWord);
    }
}
