package tutorialPractice;

public class Logical_11 {

    public static void main(String[] args) {
        System.out.println( true && true);
        System.out.println( true && false);
        System.out.println( false && true);
        System.out.println( false && false);

        System.out.println( 2 < 4 && 4 < 6);
        boolean b = 10 == 10 && false;
        System.out.println(b);

        String drink = "tea";
        boolean hot = true;
        boolean free =true;

        boolean bool = drink.equals("coffee") && hot && free;
        System.out.println(bool);
        // & still check right side // && if false doesn't check right side. faster circuit
        bool = drink.equals("coffee") & hot;
        bool = drink.equals("coffee") && hot;
        System.out.println(bool);
    }
}

