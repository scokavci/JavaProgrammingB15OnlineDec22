package tutorialPractice;

public class Casting {
    public static void main(String[] args){
        // i is integer data type. 3.9 is double decimal and bigger number. casting is needed.
        //casting means converting one data type to anther data type.
        int i = (int) 3.9;
        // two kids of casting
        System.out.println(i);
        // Implicit casting = automatically
        // byte > short > int > long > float > double
           double d1 = 200;
           long l = 30;

        // Explicit Casting  == needs conversion
           byte b1 = 5;
           short sh = 400;
           b1 = (byte)sh;
        System.out.println(b1);
           double price = 200.55;
           int price1 = (int )price;
        System.out.println(price1);

        int int1 = (int) (5/2.0);
        System.out.println(int1);


    }
}
