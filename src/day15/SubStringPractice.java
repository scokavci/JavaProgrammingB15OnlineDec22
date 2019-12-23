package day15;

public class SubStringPractice {
    public static void main(String[] args) {

        // getting the part of the String out of another String
        //              0123456789012345
        String movie = "Lord Of The Ring";

        // starting from beginning index(INCLUDES 5 BEGIN) until right before ending index (BEFORE 7) IMPORTANT
        String wordOf = movie.substring(5,7)  ;
        System.out.println("wordOf = " + wordOf);

        String wordLordOf = movie.substring(0,7);
        System.out.println("wordLordOf = " + wordLordOf);
        // I want to get the word Of from this movie

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);

        // Get the second word till last word!
        // Right after first space the second word starts
        //                01234567890123456
        //String movie = "Lord Of The Ring";

        int startingPoint = movie.indexOf(" ")+ 1;
        int endingPoint = movie.length();
        System.out.println("second word till last :" + movie.substring(startingPoint,endingPoint));

        String secondWordTillLast = movie.substring(5,16);
        System.out.println("second word till last = "+ secondWordTillLast);

        // if you want to start from somewhere and just get the rest of the String
        // above method will work , however there is even better method
        // if you provide only one parameter to substring method
        // it will just start from that location and get till end
        String secondToLast = movie.substring(5);
        System.out.println("secondToLast = " + secondToLast);
    }
}
