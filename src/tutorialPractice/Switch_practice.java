package tutorialPractice;

public class Switch_practice {
    public static void main(String[] args) {
        char restaurantRating = 'E';
        switch (restaurantRating) {
            case 'C':
            case 'D':
            case 'E':
                System.out.println("This restaurant is not my favorite.");
                break;
            case 'B':
                System.out.println("This restaurant is good. ");
                break;
            case 'A':
                System.out.println("This restaurant is fantastic! ");
                break;
            default:
                System.out.println("I've never dined at this restaurant .");
                break;

        }
    }
}

