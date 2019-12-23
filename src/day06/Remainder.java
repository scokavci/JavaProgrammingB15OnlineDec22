package day06;

public class Remainder {
    public static void main(String[] args) {
        // + - * /    %
        System.out.println( 5/2);
        System.out.println( 5.0 / 2);
        System.out.println( 5.0/2f);
        // 5 divided by 2 is the remainder is 1
        //2*2 +1 = 5
        System.out.println("-----modulus  . remainder -------");
        System.out.println(5 % 2);
        // 10*9 + 9 = 99
        System.out.println(99 % 10);
        // 10*10 +0 = 100
        System.out.println(100 % 10);

        int minutes = 135; //60*2 +15
        int hourPart = 135/60; // ---->> 2
        int minsPart = 135%60;  //----->> 15

        System.out.println("The minutes "+minutes+" is "
                +hourPart+" hours and " +minsPart+ " minutes");

    }
}
