package day29;

public class HeroIdendity2 {
    public static void main(String[] args) {

        String hero1 ="Spiderman-Clark J Kent";

        String[] hero1Splitted = hero1.split("-");
        String herocode = hero1Splitted[0];
        String fullName = hero1Splitted[1];

        // not index just count number i =1 can start
        String stars ="";
        for (int i = 1; i <= fullName.length(); i++) {
            stars += "*";
        }
        String heroX = hero1.replace(fullName,stars);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);
    }
}
