package tutorialPractice;

public class NestedIfStatement {
    public static void main(String[] args) {
        int hourOfDay = 13;

        if(hourOfDay < 12){
            System.out.println("Good Morning!");
        } else if (hourOfDay < 17) {
                System.out.println("Good Afternoon!");
            } else {
                System.out.println("Good evening!");
            }

        }
    }

