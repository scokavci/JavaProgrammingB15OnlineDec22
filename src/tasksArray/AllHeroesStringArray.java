package tasksArray;

public class AllHeroesStringArray {

    public static void main(String[] args) {
        String[] heroes = {
                "Superman-Clark Kent",
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
        int countOfHeroes = heroes.length;
        System.out.println("How many heroes are there?  " + countOfHeroes);
        for( String eachHero   :  heroes){
            String[] newEachHero = eachHero.split("-"); //{"Atom", "Ray Palmer"}
            String fullName =  newEachHero[newEachHero.length-1];
            String[] fullNameSplit = fullName.split(" "); // {"Ray","Palmer"}
            String lastName = fullNameSplit[fullNameSplit.length-1];
            System.out.println("Intials of Hero "+ fullName+":  "+ fullName.charAt(0)+ lastName.charAt(0));
        }
    }
}

//        // let's do only one
//        // "Atom-Ray Palmer"
//        // AR
//        String hero1 = "Atom-Ray Palmer";              //   0         1
//        String[] identity= hero1.split("-"); //{"Atom", "Ray Palmer"}
//        String fullName =  identity[1];
//        String[] fullNameSplit = fullName.split(" "); // {"Ray","Palmer"}
//        String lastName = fullNameSplit[fullNameSplit.length-1];
//        System.out.println("Intials of Full Name: "+ fullName.charAt(0)+ lastName.charAt(0));

