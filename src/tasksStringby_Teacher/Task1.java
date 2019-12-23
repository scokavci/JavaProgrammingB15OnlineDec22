package tasksStringby_Teacher;

public class Task1 {
    public static void main(String[] args) {
//        Task 1:
//        Given a String with any possible length including 0
//        print first 2 characters only if the String has more than 1 character
//        if the String is empty print Empty String
//else print the first char twice in same Link
//        for example :
//        "abcde" --> ab
//        ""        --> empty String
//        "J"       --> JJ

        String word = "J";

        if( word.length() > 1){
            System.out.println("first two characters: "+ word.substring(0,2));
        } else if( word.isEmpty() ){
            System.out.println("Empty String");
        } else{
            System.out.println( word.charAt(0)+""+word.charAt(0));
        }


    }
}

