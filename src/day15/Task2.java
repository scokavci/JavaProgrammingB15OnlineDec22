package day15;

public class Task2 {

    public static void main(String[] args) {
        //              0123456789012345678901234567890123
        String movie = "Cloudy With A Chance Of Meatballs";
        
        int charCount = movie.length();
        System.out.println("charCount = " + charCount);
        System.out.println(  movie.length() );

        System.out.println(movie.charAt(  movie.length() - 1));

        String wordCloudy = movie.substring(0,6);
        System.out.println("wordCloudy = " + wordCloudy);
       
        String wordOfMeatBalls = movie.substring(24);
        System.out.println("wordOfMeatBalls = " + wordOfMeatBalls);
        
        movie = movie.replace("Meatballs","Snowballs");
        System.out.println(movie);
        
    }
}
