package day10;

import java.util.Scanner;

public class SeasonAction {
    public static void main(String[] args) {
        /*
        what do you do in each session
        Spring-->> Hike, Easter, Nawruz, Blossom
        Summer-->> Swim, Vacation, BBQ, Holiday,Halloween
        Winter-->> Snowboarding, ski,Christmas, Shopping. new year
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey what is the season!!! ? ");
        String season = scan.next(); // one word next()

        //String season = "Fall";
        //  // byte, short, int, char, string

        switch (season) {
            case "Fall":
                System.out.println(" I like to go to pick up apples from the trees. ");
                break;
            case "Spring":
                System.out.println(" I like planting. ");
                break;
            case "Summer":
                System.out.println(" I like to visit my parents. ");
                break;
            case "Winter":
                System.out.println(" I like to play with my kids when it snows. ");
                break;
           default:
                System.out.println("UNKNOWN ENTRY");
                break;
        }


    }
}
