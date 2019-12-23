package myExtra_Practice;

public class NameReverse {
    public static void main(String[] args) {

        String name = "Vehbi";

        char c1 = name.charAt(0);
        char c2 = name.charAt(1);
        char c3 = name.charAt(2);
        char c4 = name.charAt(3);
        char c5 = name.charAt(4);

        System.out.println( c1 + " "+ c2 + " " + c3 + " " + c4 + " " + c5 );
        System.out.println(c5 + " " + c4 + " " + c3 + " " + c2 + " " + c1);
        System.out.println( name.charAt(4) + " " + name.charAt(3) + " " + name.charAt(2) +" "+
                            name.charAt(1) + " " + name.charAt(0));
    }
}
