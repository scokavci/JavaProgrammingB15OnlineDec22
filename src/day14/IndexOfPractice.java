package day14;

public class IndexOfPractice {

    public static void main(String[] args) {

        // indexOf -->>
        // find out index of another String inside this String
        //             01234567891011
        String name = "Game of Java";   // length is 12, last char index is 11 because index starts with zero
        //find out the location of Java
        //find out the location of letter O
        //find out the location of first space
        System.out.println("find out the location of Java");
        System.out.println( name.indexOf("Java")   );

        System.out.println("Find out the location of o");
        System.out.println( name.indexOf("o"));

        // if the location is not found, we get minus number
        // CASE SENSITIVE --- UPPER CASE
        System.out.println("find out the location of uppercase o");
        System.out.println( name.indexOf("O")    );

        // find out the location of first space
        System.out.println("Find out the location of first space");
        System.out.println(name.indexOf(" "));
    }
}
