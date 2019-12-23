package day14;

public class LastIndexOf {

    public static void main(String[] args) {

        //             01234567891011
        String name = "Game of Java";   // length is 12, last char index is 11 because index starts with zero

        //find out last location the letter a shows up
        System.out.println(  name.lastIndexOf("a")     );

        //find out last location the character space shows up
        System.out.println( name.lastIndexOf(" ")  );

        //find out last location the letter Ga shows up
        System.out.println( name.lastIndexOf("Ga"));

        //find out last location the letter Kawa shows up
        System.out.println(  name.lastIndexOf("Kawa"));

        // if I don't use contains method, what would be my condition to check
        // whether we have Kawa in this String , either using indexOf or lastIndex

        if(    name.indexOf("Kawa") > -1){
            System.out.println(" Kawa found!!!");
        }else{
            System.out.println(" No Kawa - No Pumpkin");
        }


    }
}
