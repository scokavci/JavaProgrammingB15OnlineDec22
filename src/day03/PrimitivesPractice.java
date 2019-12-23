package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {

            byte letterCount = 26;
            System.out.println ("The letter count is " + letterCount  );

            short sheepCount = 300;
            System.out.println ("The sheep count " +  sheepCount  );
            int catCount = 20 ;
            System.out.println ("The cat count is " + catCount  );
            long mileToMoon = 10000000l;
            long mileToSun = 10000000L;

            System.out.println ("The Mile to Moon is " + mileToMoon );
            System.out.println ("The Mile to Sun is " + mileToSun );
            // -----------------floating point -----------------------
            // you must add f at the end of the number to indicate this is float type
            // uppercase lowercase does not matter , but it is mandatory
            float priceOfBanana = 1.99f;
            float priceOfPotato = 2.49F;
            System.out.println ("The price of Banana is " + priceOfBanana  );
            System.out.println ("The price of Potato is " + priceOfPotato  );

            // ------------larger floating point --------------
            double priceOfIpad    = 355.99d ;
            double priceOfIpadPro = 1024.99D;
            double priceOfMac     = 2299.99 ;
            System.out.println ("The price of IPAD is " + priceOfIpad  );
            System.out.println ("The price of Ipadpro is " + priceOfIpadPro );
            System.out.println ("The price of Mac is " + priceOfMac  );
            // compiler autimatically assume it's a double so it's not required to have d
            // However for good programming habit , add them always

            // if you have a whole number by itself , compiler automatically assume it's an int
            // if you have a fractional number by itself , compiler automatically assume it's an double



    }
}
