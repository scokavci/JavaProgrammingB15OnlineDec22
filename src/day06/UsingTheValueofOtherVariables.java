package day06;

public class UsingTheValueofOtherVariables {
    public static void main(String[] args) {

      //copy one  variable to another variable
        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber ;

        System.out.println("My Favorite Number is "+ myFavoriteNumber );
        System.out.println("Your Favorite Number is "+ yourFavoriteNumber );

        yourFavoriteNumber = 100;
        System.out.println("My Favorite Number is "+ myFavoriteNumber );
        System.out.println("Your Favorite Number is "+ yourFavoriteNumber );



    }
}
