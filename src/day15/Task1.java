package day15;

public class Task1 {

    public static void main(String[] args) {

        //              01234567890123456
        String movie = "Lord Of The Ring";
        // reverse -->> Ring Of The Lord ---> one shot you can do this way
        //System.out.println( movie.substring(12,16)+ " " + movie.substring(5,7)+" "+
                          //  movie.substring(8,11)+ " "+  movie.substring(0,4));

        // another way to do or create variables and assign.
        String wordRing = movie.substring(12);
        String wordOfThe = movie.substring(4,12);
        String wordOfLord = movie.substring(0,4);
        System.out.println( wordRing + wordOfThe + wordOfLord);
          // Ring of The Lord
        // Ring of the java lord
        System.out.println( wordRing + wordOfThe +" Java"+ wordOfLord);
    }
}
