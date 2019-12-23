package day16;

public class IndexOfWithTwoParameters {
    public static void main(String[] args) {

        // get the second Java from the sentence
        // assume you already know there is 4 java in this sentence
        // second java means -->> the Java showed up after the first Java

        // where is the location of first Java showed up
        // in order to find the second one,
        // instead of searching from right after the location you found first Java
        // then it will give you the index of second Java

        // but how do I start from different location when using INDEXOF
        // because index of always start from beginning

        // index method has 2 version: 1 expect 1 external data
        // another expect 2 external data  -->>>
        //             01234567890123456789012345
        String name = "I love Java I love Java Java Java";
        System.out.println("Java starting from 0 " +   name.indexOf("Java")   );
        System.out.println( "Java starting from 7 "+    name.indexOf("Java" , 7)   );
        System.out.println( "Java starting from 8 " +   name.indexOf("Java" , 8)   );
        System.out.println( "Java starting from 9 " +  name.indexOf("Java" , 9)   );
        System.out.println( "Java starting from 19 " + name.indexOf("Java" , 19)   );
        System.out.println( "Java starting from 20 " +  name.indexOf("Java", 20)   );

        //how do i start from the location that get past first java
        // basically starting point different that 0 so that it get past first Java
        int firstJavaLocation = name.indexOf("Java"); // location of first java in this case 7
        // starting point can be right after index of first character of the word
        // or you can start here +4
        // or you can start write after you finish the word you are searching
        //why is 4 we add: because java has 4 characters
        //if we don't know the length of the word -->> +word.length()

        int startingPointToSearchSecondJava = firstJavaLocation + 1; // or you can start +4
        int secondJavaLocation = name.indexOf("Java",startingPointToSearchSecondJava);

        System.out.println("secondJavaLocation = " + secondJavaLocation);

        // I do not know how many word in this sentence
        // I just want to know what is the second word
        int firstSpaceLocation = name.indexOf(" ");

        int secondSpace = name.indexOf(" " + firstSpaceLocation + 1);

        int secondSpaceLocation = name.indexOf(" ", firstSpaceLocation + 1);
        System.out.println("Second word in this sentence is "
        + name.substring(firstSpaceLocation + 1, secondSpaceLocation));
    }
}
