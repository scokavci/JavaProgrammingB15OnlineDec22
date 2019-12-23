package day29;

public class HeroIdentity_JusticeLeage {
    public static void main(String[] args) {

        String[] allHeroes = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        // hide this hero identity
        //String heroX = "Superman-************";

        for (String eachHero : allHeroes) {
             String heroString = eachHero;
            // hide this hero identity
            //String heroX = "Superman-************";

            String[] heroSplitted = heroString.split("-");
            String heroCode = heroSplitted[0];
            String fullName = heroSplitted[1];

            String stars = "";
            for (int i = 1; i <= fullName.length(); i++) {
                stars += "*";
            }

            String heroX = heroString.replace(fullName, stars);
            System.out.println("hero  = " + heroString);
            System.out.println("heroX = " + heroX);


        }


    }


}
