package day29;

public class HeroIdentity {

    public static void main(String[] args) {
        String hero1 ="Sperman-Clark J Kent";
        // hide this hero identity
        // String heroX = "Superman-**************";
        // given a String with hero code and name separated by -
        // turn this String into hero code and * with same length as hero name

        // Plain English Logic :

        // split it by - to get the code and full name
        // get the length of full name
        // generate stars with same length as full name character count
        // one the star is generated , replace full name with Stars


        String[] hero1Splitted = hero1.split("-");
        String herocode = hero1Splitted[0];
        String fullName = hero1Splitted[1];

        int nameCharCount = fullName.length();
        String stars = "";
        for (int i = 0; i < nameCharCount ; i++) {
           stars += "*";
        }
//        System.out.println(fullName);
//        System.out.println(stars);

        String heroX = herocode+ "-"+ stars ;
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);
    }
}
