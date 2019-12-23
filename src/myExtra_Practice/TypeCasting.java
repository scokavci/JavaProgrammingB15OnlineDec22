package myExtra_Practice;

public class TypeCasting {
    public static void main(String[] args) {

        int i = (int)3.9;
        System.out.println(i);

        //Implicitly Casting
        // byte > short >int>long>float>double
        // from this order you can store short data type into big data type.
        double d1 = 200;   // int can go automatically into double
        long l = i;     // i is int can go and store under long. automatically casting
        System.out.println(l);
        //Explicitly Casting
        byte b1 = 5;
        short s1 = 400;
        b1 = (byte)s1;
        System.out.println(b1);

        double price = 200.55;
        int intPrice = (int) price;
        System.out.println(intPrice);

        int in = (int)(5/2.0);
        System.out.println(in);
       // WE CANNOT CAST STRING BECAUSE ITS NOT A PRIMITIVE DATA TYPE
        // String str = "10";
        // int n1 = (int)str;
    }
}
