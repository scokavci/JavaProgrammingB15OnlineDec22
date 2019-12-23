package day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String hero1 = "Superman-Clark Kent";
        // Hero Code is Superman and Idendity is Clark Kent
        //The initial of the Hero is CK

        //Logic 1 : split this String by dash - to get two pieces of String array
                                  // we split with - so dash is gone.
        String[] heroSplitted = hero1.split("-");
        System.out.println("heroSplitted = " + Arrays.toString(heroSplitted) );
        String hereCode = heroSplitted[0];
        String fullName = heroSplitted[1];
        System.out.println("Hero Code is "+hereCode + " and Idendity is "+fullName);
       // System.out.println("Hero Code is "+heroSplitted[0] + " and Idendity is "+heroSplitted[1]);
        // The initial of the hero is CK
        // Clark Kent
        // how can I write
        // LOGIC 1  :  get the first letter of full name
        //          then get first letter after the space
        //          concatenate them
        //          downside is what if we have middle name
        //          solution , instead of looking for the letter after first space
        //                      look for last index of the space then get next Character


        // LOGIC 2  : We already have full name stored in fullName variable
        //      split by space -->> we will get firstName (middle name) lastName
        //      get the first letter of full name
        //      then get the last name using last item index
        //      get the first character then concatenate
        // Clark Kent -->> [Clark , Kent]   Clark--> C  Kent-->> K

        String[] fullNameSplitted = fullName.split(" ");   ///   {"Clark","Kent"}

        System.out.println("fullName Splitted = " + Arrays.toString(fullNameSplitted));

        String lastName = fullNameSplitted[fullNameSplitted.length -1];
        System.out.println("lastName = " + lastName);
        System.out.println("Initial of the hero is :"+ fullName.charAt(0)+lastName.charAt(0));

    }
}
