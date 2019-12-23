package day31;

public class SeasonChecker {
    public static void main(String[] args) {
       // a String variable declared and assigned value inside main method
       // it can accessible in main method

        // season in main method does not see season in other method
        decideSeasonAction("Winter");
        decideSeasonAction("Summer");
        // instead of value to print  you can also print variable contains that has the value
        String mySeason = "AAAA";
        decideSeasonAction(mySeason);

    }
    public static void decideSeasonAction(String season){
       // this season method parameter can only be accessible inside method body
       switch(season){
           case "Spring":
               System.out.println("Hiking");
               break;
           case "Summer":
               System.out.println("Swimming");
               break;
           case" Fall":
               System.out.println("Pumpking picking");
               break;
           case "Winter":
               System.out.println("Go snowboarding");
               break;
           default:
               System.out.println("Invalid season");
            break;
       }
    }
}
