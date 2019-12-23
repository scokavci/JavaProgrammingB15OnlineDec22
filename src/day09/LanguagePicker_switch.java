package day09;

public class LanguagePicker_switch {
    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek Call Center ");
        System.out.println("Please select your language option from 1-7 ");

        int languageOption = 5;
        String greeting = "";
        switch (languageOption){
            case 1 :
                //instead of writing print line you can
                // greeting = "HELLO, SDET";
                System.out.println("Hello, SDET");
                break;
            case 2 :
                System.out.println("Salam, SDET");
                break;
            case 3 :
                System.out.println("Holo, SDET");
                break;
            case 4 :
                System.out.println("Privet, SDET");
                break;
            case 5 :
                System.out.println("merhaba, SDET");
                break;
            case 6 :
                System.out.println("Szia, SDET");
                break;
            default:
                System.out.println("unknown");
               // System.out.println("This the message you will get :" +greeting);
        }
    }
}
