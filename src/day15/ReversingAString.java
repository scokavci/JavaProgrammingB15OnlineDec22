package day15;

public class ReversingAString {
    public static void main(String[] args) {


        String name = "Akbar";
        System.out.println( name.charAt(0) + " "+ name.charAt(1)+" "+ name.charAt(2)+ " "+
                            name.charAt(3) + " " + name.charAt(4));

        System.out.println( name.charAt(4) + " "+ name.charAt(3)+" "+ name.charAt(2)+ " "+
                name.charAt(1) + " " + name.charAt(0));

        String name1 = "SUMEYYE";
        char c1 = name1.charAt(0);
        char c2 = name1.charAt(1);
        char c3 = name1.charAt(2);
        char c4 = name1.charAt(3);
        char c5 = name1.charAt(4);
        char c6 = name1.charAt(5);
        char c7 = name1.charAt(6);

        System.out.println( c7+" " +c6+" "+c5+" "+c4+" "+c3+" "+c2+" "+c1);

        // how do you find out last character of any string
        // counting character start with one
        // counting index (location) starts with 0
        // last character index/location will be always ONE LESS THAN actual character count

        int characterCount = name.length();
        int lastCharIndex = characterCount - 1;
        char lastChar = name.charAt(lastCharIndex);
        System.out.println("LAST CHAR IS "+ lastChar);
        System.out.println( "last char in on shot "+ name.charAt( name.length()- 1 ));


    }
}
