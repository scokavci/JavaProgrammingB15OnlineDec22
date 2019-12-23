package day17;

public class FullName_Corrector {
    public static void main(String[] args) {

        String fullName = "arYa sTark";

        String firstName = fullName. substring(0,4);
        String lastName = fullName.substring(5);

        String firstnameCorrected =
                firstName.toUpperCase().substring(0,1)+     // ARYA --->>> A
                                    firstName.toLowerCase().substring(1);   // arya -->> rya

        System.out.println("firstnameCorrected = " + firstnameCorrected);
        
        String lastnameCorrected =
                lastName.toUpperCase().substring(0,1)+
                lastName.toLowerCase().substring(1);
        System.out.println("lastnameCorrected = " + lastnameCorrected);

        System.out.println(firstnameCorrected+ " "+ lastnameCorrected);
    }
}
