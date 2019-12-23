package replit;
import java.util.Scanner;

public class CaffeineDoze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        double numberOfMg = scan.nextDouble();

        double numberOfGram = (numberOfMg / 1000) ;

        int numberOfDrinks = (int)(10 / numberOfGram) ;

        System.out.println("It would take about "+numberOfDrinks+" drinks for a lethal overdose.");

    }
}
