package office_hour;

import java.sql.SQLOutput;

public class Practice_12_2 {
    public static void main(String[] args) {

        String item = "Echo Dot (3rd Gen) Charcoal";

        //get whatever is inside parenthesis ()
        System.out.println(   item.substring( 9,18));
        System.out.println(   item.substring( 9,18));
        
        int indexOfOpeningParenthesis = item.indexOf("(");
        int indexOfEndingParenthesis = item.indexOf(")");
        
        String wordInsideParenthesis = item.substring( indexOfOpeningParenthesis+1  , indexOfEndingParenthesis  );
        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);
        
    //    ...................................
        
        String letters = "J%a^V**$1a(";
        System.out.println("letters = " + letters);
        // remove % ^ *1 $ (
        // letters.replace() already string so we can continue
        // replace = string then to UpperCase another method can work since it is string
        // chaining method
        letters = letters.replace( "%" , "")
                          .replace("^","")
                          .replace("*", "")
                          .replace("1", "")
                          .replace("$","")
                          .replace("(","")
                          .toUpperCase();

        System.out.println("letters = " + letters);
    }
}

