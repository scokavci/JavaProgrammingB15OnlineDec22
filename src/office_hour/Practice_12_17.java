package office_hour;

public class Practice_12_17 {

    public static void main(String[] args) {
        // primitive data types: byte, short, float, long, double, char, boolean
        //nonprimitive data types: String, array, scanner
        // methods
        int number = 6;
        String word = "java";

        //replace j-->> c
        System.out.println(  word.replace("j", "c"));
        System.out.println(word);  // java
        System.out.println("word"); // word
        System.out.println(  number +6);  //12

        // in order to see how many chars we have in a variable
        System.out.println("character counts of word:"+  word.length()  );
        //             0
        String book = "learn java in 1 day, java is fun";

        System.out.println( "first j index: "+ book.indexOf("j"));
        int indexJ = book.indexOf("j");
        System.out.println(  book.substring( indexJ , indexJ+4));

        System.out.println("last index of J"+ book.lastIndexOf("j") );


        System.out.println( book.length() );
        // I want only one char -->>
        System.out.println( book.charAt(0));
        System.out.println( book.indexOf(" "));

        // we can use substring method to get one or more chars
        String student = "Rabia";
        System.out.println(  student.substring(2));  //bia
        System.out.println( student.substring(0,1)  ); //R
        System.out.println( student.substring(4));    //a
        System.out.println(  student.toUpperCase() );  //RABIA
        System.out.println(  student.toLowerCase()  );  //rabia

        String lowerCaseName = student.toLowerCase();
        System.out.println(lowerCaseName);

        String batch = "Online";

        //uppercase+ length
        System.out.println(batch.toUpperCase().length());

        System.out.println("Asiye".toUpperCase().length());  // result number

        // trim
        String name = "  Asiya    ";
        System.out.println(name.trim() );
    }
}
