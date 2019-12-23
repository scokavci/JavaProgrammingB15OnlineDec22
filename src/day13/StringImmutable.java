package day13;

public class StringImmutable {
    public static void main(String[] args) {

        String name = "Pumpkin";
        System.out.println(   name  );
        //String is immutable , once created it cannot be changed
        // any String actions / methods that looks like changing the variable
        name.toUpperCase();
        System.out.println(name);

        System.out.println(  name.toUpperCase()  );

        //WHAT IF I REALLY WANT TO CHANGE THE NAME

        name = name.toUpperCase()  ;
        System.out.println( name );
    }
}
