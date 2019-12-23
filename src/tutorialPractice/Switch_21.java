package tutorialPractice;

public class Switch_21 {
    public static void main(String[] args) {

        int restaurantRating = 3;
        switch (restaurantRating) {
           /* default:   // default can be at the top or at the bottom or middle
           //           but only in can be written once. it is better habit to write at the bottom
                System.out.println("I've never dined at this restaurant .");
                break;

            */

            case 1:
                System.out.println("This restaurant is not my favorite.");
                break;
            case 2:
                System.out.println("This restaruant is good. ");
                break;
            case 3:
                System.out.println("This restaruant is fantastic! ");
                break;
            default:
                System.out.println("I've never dined at this restaruant .");
                break;

        }
    }
}
