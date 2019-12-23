package day32;

public class StringActions {

    public static void main(String[] args) {
        // reversePrintMyOwnName();
        printStringWithDashInBetween("Sumeyye");
        printStringWithDashInBetween("Ayse");
        printStringWithDashInBetween("Lisa");
// print each and every character of  s string with dash in between
        // excluding the last one S-u-m-e-y -y -e
        // when it comes to last character don't add it.

    }
//    reversePrintMyOwnName
//    create a method that has no parameter
//    and print your name in reversed order
    public static void reversePrintMyOwnName(){
        String name = "Sumeyye";
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print( name.charAt(i) );
        }
    }

    public static void printStringWithDashInBetween(String name){
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            // if I am not at last index then I print
            if(  i!= name.length()-1  ){
                System.out.print("-");
            }
        }
        System.out.println();
    }
}
