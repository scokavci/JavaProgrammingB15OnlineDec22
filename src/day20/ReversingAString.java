package day20;

public class ReversingAString {
    public static void main(String[] args) {

        String name = "Alisa Zakirova";
        String reversedName = "";

        int lastcharIndex = name.length() - 1;

        for (int x = lastcharIndex; x >= 0; x--) {
            
            System.out.print(x + " index : ");
            
            char currentChar = name.charAt(x);
            System.out.println( currentChar  );

            reversedName = reversedName + currentChar;
        }
        System.out.println("reversedName = " + reversedName);

        //This is all we needed-->> shorter

//        for (int x = lastcharIndex; x >= 0; x--) {
//            reversedName = reversedName + name.charAt(x) ;
//        }
//        System.out.println("reversedName = " + reversedName);


//        System.out.print(   name.charAt(7) );  old version before loop
//        System.out.print(   name.charAt(6) );
//        System.out.print(   name.charAt(5) );
//        System.out.print(   name.charAt(4) );
//        System.out.print(   name.charAt(3) );
//        System.out.print(   name.charAt(2) );
//        System.out.print(   name.charAt(1) );
//        System.out.print(   name.charAt(0) );

    }
}
